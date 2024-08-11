package com.example.easyfood.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.easyfood.data.pojo.MealDB;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MealDB> __insertionAdapterOfMealDB;

  private final EntityDeletionOrUpdateAdapter<MealDB> __deletionAdapterOfMealDB;

  private final EntityDeletionOrUpdateAdapter<MealDB> __updateAdapterOfMealDB;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMealById;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMealDB = new EntityInsertionAdapter<MealDB>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `meal_information` (`mealId`,`mealName`,`mealCountry`,`mealCategory`,`mealInstruction`,`mealThumb`,`mealYoutubeLink`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MealDB value) {
        stmt.bindLong(1, value.getMealId());
        if (value.getMealName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMealName());
        }
        if (value.getMealCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMealCountry());
        }
        if (value.getMealCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMealCategory());
        }
        if (value.getMealInstruction() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMealInstruction());
        }
        if (value.getMealThumb() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMealThumb());
        }
        if (value.getMealYoutubeLink() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getMealYoutubeLink());
        }
      }
    };
    this.__deletionAdapterOfMealDB = new EntityDeletionOrUpdateAdapter<MealDB>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `meal_information` WHERE `mealId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MealDB value) {
        stmt.bindLong(1, value.getMealId());
      }
    };
    this.__updateAdapterOfMealDB = new EntityDeletionOrUpdateAdapter<MealDB>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `meal_information` SET `mealId` = ?,`mealName` = ?,`mealCountry` = ?,`mealCategory` = ?,`mealInstruction` = ?,`mealThumb` = ?,`mealYoutubeLink` = ? WHERE `mealId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MealDB value) {
        stmt.bindLong(1, value.getMealId());
        if (value.getMealName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMealName());
        }
        if (value.getMealCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMealCountry());
        }
        if (value.getMealCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMealCategory());
        }
        if (value.getMealInstruction() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMealInstruction());
        }
        if (value.getMealThumb() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMealThumb());
        }
        if (value.getMealYoutubeLink() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getMealYoutubeLink());
        }
        stmt.bindLong(8, value.getMealId());
      }
    };
    this.__preparedStmtOfDeleteMealById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM meal_information WHERE mealId =?";
        return _query;
      }
    };
  }

  @Override
  public void insertFavorite(final MealDB meal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMealDB.insert(meal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMeal(final MealDB meal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMealDB.handle(meal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateFavorite(final MealDB meal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMealDB.handle(meal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMealById(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMealById.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMealById.release(_stmt);
    }
  }

  @Override
  public LiveData<List<MealDB>> getAllSavedMeals() {
    final String _sql = "SELECT * FROM meal_information order by mealId asc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"meal_information"}, false, new Callable<List<MealDB>>() {
      @Override
      public List<MealDB> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMealId = CursorUtil.getColumnIndexOrThrow(_cursor, "mealId");
          final int _cursorIndexOfMealName = CursorUtil.getColumnIndexOrThrow(_cursor, "mealName");
          final int _cursorIndexOfMealCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "mealCountry");
          final int _cursorIndexOfMealCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "mealCategory");
          final int _cursorIndexOfMealInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "mealInstruction");
          final int _cursorIndexOfMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "mealThumb");
          final int _cursorIndexOfMealYoutubeLink = CursorUtil.getColumnIndexOrThrow(_cursor, "mealYoutubeLink");
          final List<MealDB> _result = new ArrayList<MealDB>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MealDB _item;
            final int _tmpMealId;
            _tmpMealId = _cursor.getInt(_cursorIndexOfMealId);
            final String _tmpMealName;
            if (_cursor.isNull(_cursorIndexOfMealName)) {
              _tmpMealName = null;
            } else {
              _tmpMealName = _cursor.getString(_cursorIndexOfMealName);
            }
            final String _tmpMealCountry;
            if (_cursor.isNull(_cursorIndexOfMealCountry)) {
              _tmpMealCountry = null;
            } else {
              _tmpMealCountry = _cursor.getString(_cursorIndexOfMealCountry);
            }
            final String _tmpMealCategory;
            if (_cursor.isNull(_cursorIndexOfMealCategory)) {
              _tmpMealCategory = null;
            } else {
              _tmpMealCategory = _cursor.getString(_cursorIndexOfMealCategory);
            }
            final String _tmpMealInstruction;
            if (_cursor.isNull(_cursorIndexOfMealInstruction)) {
              _tmpMealInstruction = null;
            } else {
              _tmpMealInstruction = _cursor.getString(_cursorIndexOfMealInstruction);
            }
            final String _tmpMealThumb;
            if (_cursor.isNull(_cursorIndexOfMealThumb)) {
              _tmpMealThumb = null;
            } else {
              _tmpMealThumb = _cursor.getString(_cursorIndexOfMealThumb);
            }
            final String _tmpMealYoutubeLink;
            if (_cursor.isNull(_cursorIndexOfMealYoutubeLink)) {
              _tmpMealYoutubeLink = null;
            } else {
              _tmpMealYoutubeLink = _cursor.getString(_cursorIndexOfMealYoutubeLink);
            }
            _item = new MealDB(_tmpMealId,_tmpMealName,_tmpMealCountry,_tmpMealCategory,_tmpMealInstruction,_tmpMealThumb,_tmpMealYoutubeLink);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public MealDB getMealById(final String id) {
    final String _sql = "SELECT * FROM meal_information WHERE mealId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMealId = CursorUtil.getColumnIndexOrThrow(_cursor, "mealId");
      final int _cursorIndexOfMealName = CursorUtil.getColumnIndexOrThrow(_cursor, "mealName");
      final int _cursorIndexOfMealCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "mealCountry");
      final int _cursorIndexOfMealCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "mealCategory");
      final int _cursorIndexOfMealInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "mealInstruction");
      final int _cursorIndexOfMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "mealThumb");
      final int _cursorIndexOfMealYoutubeLink = CursorUtil.getColumnIndexOrThrow(_cursor, "mealYoutubeLink");
      final MealDB _result;
      if(_cursor.moveToFirst()) {
        final int _tmpMealId;
        _tmpMealId = _cursor.getInt(_cursorIndexOfMealId);
        final String _tmpMealName;
        if (_cursor.isNull(_cursorIndexOfMealName)) {
          _tmpMealName = null;
        } else {
          _tmpMealName = _cursor.getString(_cursorIndexOfMealName);
        }
        final String _tmpMealCountry;
        if (_cursor.isNull(_cursorIndexOfMealCountry)) {
          _tmpMealCountry = null;
        } else {
          _tmpMealCountry = _cursor.getString(_cursorIndexOfMealCountry);
        }
        final String _tmpMealCategory;
        if (_cursor.isNull(_cursorIndexOfMealCategory)) {
          _tmpMealCategory = null;
        } else {
          _tmpMealCategory = _cursor.getString(_cursorIndexOfMealCategory);
        }
        final String _tmpMealInstruction;
        if (_cursor.isNull(_cursorIndexOfMealInstruction)) {
          _tmpMealInstruction = null;
        } else {
          _tmpMealInstruction = _cursor.getString(_cursorIndexOfMealInstruction);
        }
        final String _tmpMealThumb;
        if (_cursor.isNull(_cursorIndexOfMealThumb)) {
          _tmpMealThumb = null;
        } else {
          _tmpMealThumb = _cursor.getString(_cursorIndexOfMealThumb);
        }
        final String _tmpMealYoutubeLink;
        if (_cursor.isNull(_cursorIndexOfMealYoutubeLink)) {
          _tmpMealYoutubeLink = null;
        } else {
          _tmpMealYoutubeLink = _cursor.getString(_cursorIndexOfMealYoutubeLink);
        }
        _result = new MealDB(_tmpMealId,_tmpMealName,_tmpMealCountry,_tmpMealCategory,_tmpMealInstruction,_tmpMealThumb,_tmpMealYoutubeLink);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
