package com.example.easyfood.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/easyfood/adapters/MostPopularRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/easyfood/adapters/MostPopularRecyclerAdapter$MostPopularMealViewHolder;", "()V", "mealsList", "", "Lcom/example/easyfood/data/pojo/Meal;", "onItemClick", "Lcom/example/easyfood/adapters/OnItemClick;", "onLongItemClick", "Lcom/example/easyfood/adapters/OnLongItemClick;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMealList", "setOnClickListener", "setOnLongCLickListener", "MostPopularMealViewHolder", "app_debug"})
public final class MostPopularRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.easyfood.adapters.MostPopularRecyclerAdapter.MostPopularMealViewHolder> {
    private java.util.List<com.example.easyfood.data.pojo.Meal> mealsList;
    private com.example.easyfood.adapters.OnItemClick onItemClick;
    private com.example.easyfood.adapters.OnLongItemClick onLongItemClick;
    
    public MostPopularRecyclerAdapter() {
        super();
    }
    
    public final void setMealList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.easyfood.data.pojo.Meal> mealsList) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.OnItemClick onItemClick) {
    }
    
    public final void setOnLongCLickListener(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.OnLongItemClick onLongItemClick) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.easyfood.adapters.MostPopularRecyclerAdapter.MostPopularMealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.MostPopularRecyclerAdapter.MostPopularMealViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/easyfood/adapters/MostPopularRecyclerAdapter$MostPopularMealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/easyfood/databinding/MostPopularCardBinding;", "(Lcom/example/easyfood/databinding/MostPopularCardBinding;)V", "getBinding", "()Lcom/example/easyfood/databinding/MostPopularCardBinding;", "app_debug"})
    public static final class MostPopularMealViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.easyfood.databinding.MostPopularCardBinding binding = null;
        
        public MostPopularMealViewHolder(@org.jetbrains.annotations.NotNull
        com.example.easyfood.databinding.MostPopularCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.easyfood.databinding.MostPopularCardBinding getBinding() {
            return null;
        }
    }
}