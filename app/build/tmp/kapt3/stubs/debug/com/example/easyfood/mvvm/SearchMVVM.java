package com.example.easyfood.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/easyfood/mvvm/SearchMVVM;", "Landroidx/lifecycle/ViewModel;", "()V", "searchedMealLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/easyfood/data/pojo/MealDetail;", "observeSearchLiveData", "Landroidx/lifecycle/LiveData;", "searchMealDetail", "", "name", "", "context", "Landroid/content/Context;", "app_debug"})
public final class SearchMVVM extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.example.easyfood.data.pojo.MealDetail> searchedMealLiveData;
    
    public SearchMVVM() {
        super();
    }
    
    public final void searchMealDetail(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.easyfood.data.pojo.MealDetail> observeSearchLiveData() {
        return null;
    }
}