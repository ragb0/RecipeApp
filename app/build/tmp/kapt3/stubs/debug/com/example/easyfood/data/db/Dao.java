package com.example.easyfood.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/easyfood/data/db/Dao;", "", "deleteMeal", "", "meal", "Lcom/example/easyfood/data/pojo/MealDB;", "deleteMealById", "id", "", "getAllSavedMeals", "Landroidx/lifecycle/LiveData;", "", "getMealById", "insertFavorite", "updateFavorite", "app_debug"})
public abstract interface Dao {
    
    @androidx.room.Insert
    public abstract void insertFavorite(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal);
    
    @androidx.room.Update
    public abstract void updateFavorite(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM meal_information order by mealId asc")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDB>> getAllSavedMeals();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM meal_information WHERE mealId =:id")
    public abstract com.example.easyfood.data.pojo.MealDB getMealById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @androidx.room.Query(value = "DELETE FROM meal_information WHERE mealId =:id")
    public abstract void deleteMealById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @androidx.room.Delete
    public abstract void deleteMeal(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal);
}