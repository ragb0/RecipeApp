package com.example.easyfood.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/easyfood/adapters/MealRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/easyfood/adapters/MealRecyclerAdapter$MealViewHolder;", "()V", "mealList", "", "Lcom/example/easyfood/data/pojo/Meal;", "setOnMealClickListener", "Lcom/example/easyfood/adapters/SetOnMealClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCategoryList", "MealViewHolder", "app_debug"})
public final class MealRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.easyfood.adapters.MealRecyclerAdapter.MealViewHolder> {
    private java.util.List<com.example.easyfood.data.pojo.Meal> mealList;
    private com.example.easyfood.adapters.SetOnMealClickListener setOnMealClickListener;
    
    public MealRecyclerAdapter() {
        super();
    }
    
    public final void setCategoryList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.easyfood.data.pojo.Meal> mealList) {
    }
    
    public final void setOnMealClickListener(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.SetOnMealClickListener setOnMealClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.easyfood.adapters.MealRecyclerAdapter.MealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.MealRecyclerAdapter.MealViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/easyfood/adapters/MealRecyclerAdapter$MealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/easyfood/databinding/MealCardBinding;", "(Lcom/example/easyfood/databinding/MealCardBinding;)V", "getBinding", "()Lcom/example/easyfood/databinding/MealCardBinding;", "app_debug"})
    public static final class MealViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.easyfood.databinding.MealCardBinding binding = null;
        
        public MealViewHolder(@org.jetbrains.annotations.NotNull
        com.example.easyfood.databinding.MealCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.easyfood.databinding.MealCardBinding getBinding() {
            return null;
        }
    }
}