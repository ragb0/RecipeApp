package com.example.easyfood.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/easyfood/mvvm/DetailsMVVM;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allMeals", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/easyfood/data/pojo/MealDB;", "mutableMealBottomSheet", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/easyfood/data/pojo/MealDetail;", "mutableMealDetail", "repository", "Lcom/example/easyfood/data/db/Repository;", "deleteMeal", "Lkotlinx/coroutines/Job;", "meal", "deleteMealById", "", "mealId", "", "getAllSavedMeals", "getMealById", "id", "getMealByIdBottomSheet", "insertMeal", "isMealSavedInDatabase", "", "observeMealBottomSheet", "observeMealDetail", "observeSaveMeal", "app_debug"})
public final class DetailsMVVM extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.easyfood.data.pojo.MealDetail>> mutableMealDetail = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.easyfood.data.pojo.MealDetail>> mutableMealBottomSheet = null;
    private androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDB>> allMeals;
    private com.example.easyfood.data.db.Repository repository;
    
    public DetailsMVVM(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    public final void getAllSavedMeals() {
    }
    
    public final void insertMeal(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteMeal(@org.jetbrains.annotations.NotNull
    com.example.easyfood.data.pojo.MealDB meal) {
        return null;
    }
    
    public final void getMealById(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public final boolean isMealSavedInDatabase(@org.jetbrains.annotations.NotNull
    java.lang.String mealId) {
        return false;
    }
    
    public final void deleteMealById(@org.jetbrains.annotations.NotNull
    java.lang.String mealId) {
    }
    
    public final void getMealByIdBottomSheet(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDetail>> observeMealDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDetail>> observeMealBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.MealDB>> observeSaveMeal() {
        return null;
    }
}