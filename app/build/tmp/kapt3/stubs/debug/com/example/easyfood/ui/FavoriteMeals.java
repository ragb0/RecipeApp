package com.example.easyfood.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/example/easyfood/ui/FavoriteMeals;", "Landroidx/fragment/app/Fragment;", "()V", "detailsMVVM", "Lcom/example/easyfood/mvvm/DetailsMVVM;", "fBinding", "Lcom/example/easyfood/databinding/FragmentFavoriteMealsBinding;", "getFBinding", "()Lcom/example/easyfood/databinding/FragmentFavoriteMealsBinding;", "setFBinding", "(Lcom/example/easyfood/databinding/FragmentFavoriteMealsBinding;)V", "myAdapter", "Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter;", "recView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "observeBottomDialog", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFavoriteLongMealClick", "onFavoriteMealClick", "onViewCreated", "view", "prepareRecyclerView", "v", "showDeleteSnackBar", "favoriteMeal", "Lcom/example/easyfood/data/pojo/MealDB;", "app_debug"})
public final class FavoriteMeals extends androidx.fragment.app.Fragment {
    public androidx.recyclerview.widget.RecyclerView recView;
    public com.example.easyfood.databinding.FragmentFavoriteMealsBinding fBinding;
    private com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter myAdapter;
    private com.example.easyfood.mvvm.DetailsMVVM detailsMVVM;
    
    public FavoriteMeals() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getRecView() {
        return null;
    }
    
    public final void setRecView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.easyfood.databinding.FragmentFavoriteMealsBinding getFBinding() {
        return null;
    }
    
    public final void setFBinding(@org.jetbrains.annotations.NotNull
    com.example.easyfood.databinding.FragmentFavoriteMealsBinding p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showDeleteSnackBar(com.example.easyfood.data.pojo.MealDB favoriteMeal) {
    }
    
    private final void observeBottomDialog() {
    }
    
    private final void prepareRecyclerView(android.view.View v) {
    }
    
    private final void onFavoriteMealClick() {
    }
    
    private final void onFavoriteLongMealClick() {
    }
}