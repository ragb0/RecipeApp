package com.example.easyfood.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/easyfood/mvvm/CategoryMVVM;", "Landroidx/lifecycle/ViewModel;", "()V", "categories", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/easyfood/data/pojo/Category;", "getCategories", "", "observeCategories", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class CategoryMVVM extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.easyfood.data.pojo.Category>> categories;
    
    public CategoryMVVM() {
        super();
    }
    
    private final void getCategories() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.easyfood.data.pojo.Category>> observeCategories() {
        return null;
    }
}