package com.example.easyfood.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/easyfood/adapters/SingleCardRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/easyfood/adapters/SingleCardRecyclerAdapter$SingleMealViewHolder;", "()V", "mealList", "", "Lcom/example/easyfood/data/pojo/Meal;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMealList", "SingleMealViewHolder", "app_debug"})
public final class SingleCardRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.easyfood.adapters.SingleCardRecyclerAdapter.SingleMealViewHolder> {
    private java.util.List<com.example.easyfood.data.pojo.Meal> mealList;
    
    public SingleCardRecyclerAdapter() {
        super();
    }
    
    public final void setMealList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.easyfood.data.pojo.Meal> mealList) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.easyfood.adapters.SingleCardRecyclerAdapter.SingleMealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.SingleCardRecyclerAdapter.SingleMealViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/easyfood/adapters/SingleCardRecyclerAdapter$SingleMealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/easyfood/databinding/SingleMealCardBinding;", "(Lcom/example/easyfood/databinding/SingleMealCardBinding;)V", "getBinding", "()Lcom/example/easyfood/databinding/SingleMealCardBinding;", "app_debug"})
    public static final class SingleMealViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.easyfood.databinding.SingleMealCardBinding binding = null;
        
        public SingleMealViewHolder(@org.jetbrains.annotations.NotNull
        com.example.easyfood.databinding.SingleMealCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.easyfood.databinding.SingleMealCardBinding getBinding() {
            return null;
        }
    }
}