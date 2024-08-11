package com.example.easyfood.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter$FavoriteViewHolder;", "()V", "favoriteMeals", "", "Lcom/example/easyfood/data/pojo/MealDB;", "onFavoriteClickListener", "Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter$OnFavoriteClickListener;", "onFavoriteLongClickListener", "Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter$OnFavoriteLongClickListener;", "getItemCount", "", "getMelaByPosition", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFavoriteMealsList", "setOnFavoriteLongClickListener", "setOnFavoriteMealClickListener", "FavoriteViewHolder", "OnFavoriteClickListener", "OnFavoriteLongClickListener", "app_debug"})
public final class FavoriteMealsRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.FavoriteViewHolder> {
    private java.util.List<com.example.easyfood.data.pojo.MealDB> favoriteMeals;
    private com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.OnFavoriteClickListener onFavoriteClickListener;
    private com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.OnFavoriteLongClickListener onFavoriteLongClickListener;
    
    public FavoriteMealsRecyclerAdapter() {
        super();
    }
    
    public final void setFavoriteMealsList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.easyfood.data.pojo.MealDB> favoriteMeals) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.easyfood.data.pojo.MealDB getMelaByPosition(int position) {
        return null;
    }
    
    public final void setOnFavoriteMealClickListener(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.OnFavoriteClickListener onFavoriteClickListener) {
    }
    
    public final void setOnFavoriteLongClickListener(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.OnFavoriteLongClickListener onFavoriteLongClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.FavoriteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.FavoriteMealsRecyclerAdapter.FavoriteViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter$FavoriteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/easyfood/databinding/FavMealCardBinding;", "(Lcom/example/easyfood/databinding/FavMealCardBinding;)V", "getBinding", "()Lcom/example/easyfood/databinding/FavMealCardBinding;", "app_debug"})
    public static final class FavoriteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.easyfood.databinding.FavMealCardBinding binding = null;
        
        public FavoriteViewHolder(@org.jetbrains.annotations.NotNull
        com.example.easyfood.databinding.FavMealCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.easyfood.databinding.FavMealCardBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter$OnFavoriteClickListener;", "", "onFavoriteClick", "", "meal", "Lcom/example/easyfood/data/pojo/MealDB;", "app_debug"})
    public static abstract interface OnFavoriteClickListener {
        
        public abstract void onFavoriteClick(@org.jetbrains.annotations.NotNull
        com.example.easyfood.data.pojo.MealDB meal);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/easyfood/adapters/FavoriteMealsRecyclerAdapter$OnFavoriteLongClickListener;", "", "onFavoriteLongCLick", "", "meal", "Lcom/example/easyfood/data/pojo/MealDB;", "app_debug"})
    public static abstract interface OnFavoriteLongClickListener {
        
        public abstract void onFavoriteLongCLick(@org.jetbrains.annotations.NotNull
        com.example.easyfood.data.pojo.MealDB meal);
    }
}