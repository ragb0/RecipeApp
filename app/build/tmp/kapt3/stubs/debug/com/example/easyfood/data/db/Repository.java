package com.example.easyfood.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/easyfood/data/db/Repository;", "", "mealDao", "Lcom/example/easyfood/data/db/Dao;", "(Lcom/example/easyfood/data/db/Dao;)V", "mealList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/easyfood/data/pojo/MealDB;", "getMealList", "()Landroidx/lifecycle/LiveData;", "deleteMeal", "", "meal", "(Lcom/example/easyfood/data/pojo/MealDB;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMealById", "mealId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMealById", "insertFavoriteMeal", "app_debug"})
public final class Repository {
    private final com.example.easyfood.data.db.Dao mealDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDB>> mealList = null;
    
    public Repository(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.db.Dao mealDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDB>> getMealList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertFavoriteMeal(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMealById(@org.jetbrains.annotations.NotNull
    java.lang.String mealId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.easyfood.data.pojo.MealDB> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteMealById(@org.jetbrains.annotations.NotNull
    java.lang.String mealId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteMeal(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}