package com.example.easyfood.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MealsDatabase_Impl extends MealsDatabase {
  private volatile Dao _dao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(6) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `meal_information` (`mealId` INTEGER NOT NULL, `mealName` TEXT NOT NULL, `mealCountry` TEXT NOT NULL, `mealCategory` TEXT NOT NULL, `mealInstruction` TEXT NOT NULL, `mealThumb` TEXT NOT NULL, `mealYoutubeLink` TEXT NOT NULL, PRIMARY KEY(`mealId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'aa71d70da8e7936eab464e4f119fe89f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `meal_information`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMealInformation = new HashMap<String, TableInfo.Column>(7);
        _columnsMealInformation.put("mealId", new TableInfo.Column("mealId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("mealName", new TableInfo.Column("mealName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("mealCountry", new TableInfo.Column("mealCountry", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("mealCategory", new TableInfo.Column("mealCategory", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("mealInstruction", new TableInfo.Column("mealInstruction", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("mealThumb", new TableInfo.Column("mealThumb", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("mealYoutubeLink", new TableInfo.Column("mealYoutubeLink", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMealInformation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMealInformation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMealInformation = new TableInfo("meal_information", _columnsMealInformation, _foreignKeysMealInformation, _indicesMealInformation);
        final TableInfo _existingMealInformation = TableInfo.read(_db, "meal_information");
        if (! _infoMealInformation.equals(_existingMealInformation)) {
          return new RoomOpenHelper.ValidationResult(false, "meal_information(com.example.easyfood.data.pojo.MealDB).\n"
                  + " Expected:\n" + _infoMealInformation + "\n"
                  + " Found:\n" + _existingMealInformation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "aa71d70da8e7936eab464e4f119fe89f", "1cfebce0bacb1a8af4e356551ea5124c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "meal_information");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `meal_information`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(Dao.class, Dao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Dao dao() {
    if (_dao != null) {
      return _dao;
    } else {
      synchronized(this) {
        if(_dao == null) {
          _dao = new Dao_Impl(this);
        }
        return _dao;
      }
    }
  }
}
