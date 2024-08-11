package com.example.easyfood.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/easyfood/mvvm/MainFragMVVM;", "Landroidx/lifecycle/ViewModel;", "()V", "mutableCategory", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/easyfood/data/pojo/CategoryResponse;", "mutableMealsByCategory", "Lcom/example/easyfood/data/pojo/MealsResponse;", "mutableRandomMeal", "Lcom/example/easyfood/data/pojo/RandomMealResponse;", "getAllCategories", "", "getMealsByCategory", "category", "", "getRandomMeal", "observeCategories", "Landroidx/lifecycle/LiveData;", "observeMealByCategory", "observeRandomMeal", "app_debug"})
public final class MainFragMVVM extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.easyfood.data.pojo.CategoryResponse> mutableCategory = null;
    private final androidx.lifecycle.MutableLiveData<com.example.easyfood.data.pojo.RandomMealResponse> mutableRandomMeal = null;
    private final androidx.lifecycle.MutableLiveData<com.example.easyfood.data.pojo.MealsResponse> mutableMealsByCategory = null;
    
    public MainFragMVVM() {
        super();
    }
    
    private final void getAllCategories() {
    }
    
    private final void getRandomMeal() {
    }
    
    private final void getMealsByCategory(java.lang.String category) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.easyfood.data.pojo.MealsResponse> observeMealByCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.easyfood.data.pojo.RandomMealResponse> observeRandomMeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.easyfood.data.pojo.CategoryResponse> observeCategories() {
        return null;
    }
}