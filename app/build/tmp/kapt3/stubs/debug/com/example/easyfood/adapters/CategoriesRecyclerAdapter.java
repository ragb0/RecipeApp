package com.example.easyfood.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter$CategoryViewHolder;", "()V", "categoryList", "", "Lcom/example/easyfood/data/pojo/Category;", "onItemClick", "Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter$OnItemCategoryClicked;", "onLongCategoryClick", "Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter$OnLongCategoryClick;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClicked", "setCategoryList", "setOnLongCategoryClick", "CategoryViewHolder", "OnItemCategoryClicked", "OnLongCategoryClick", "app_debug"})
public final class CategoriesRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.easyfood.adapters.CategoriesRecyclerAdapter.CategoryViewHolder> {
    private java.util.List<com.example.easyfood.data.pojo.Category> categoryList;
    private com.example.easyfood.adapters.CategoriesRecyclerAdapter.OnItemCategoryClicked onItemClick;
    private com.example.easyfood.adapters.CategoriesRecyclerAdapter.OnLongCategoryClick onLongCategoryClick;
    
    public CategoriesRecyclerAdapter() {
        super();
    }
    
    public final void setCategoryList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.easyfood.data.pojo.Category> categoryList) {
    }
    
    public final void setOnLongCategoryClick(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.CategoriesRecyclerAdapter.OnLongCategoryClick onLongCategoryClick) {
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.CategoriesRecyclerAdapter.OnItemCategoryClicked onItemClick) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.easyfood.adapters.CategoriesRecyclerAdapter.CategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.easyfood.adapters.CategoriesRecyclerAdapter.CategoryViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/easyfood/databinding/CategoryCardBinding;", "(Lcom/example/easyfood/databinding/CategoryCardBinding;)V", "getBinding", "()Lcom/example/easyfood/databinding/CategoryCardBinding;", "app_debug"})
    public static final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.easyfood.databinding.CategoryCardBinding binding = null;
        
        public CategoryViewHolder(@org.jetbrains.annotations.NotNull
        com.example.easyfood.databinding.CategoryCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.easyfood.databinding.CategoryCardBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter$OnItemCategoryClicked;", "", "onClickListener", "", "category", "Lcom/example/easyfood/data/pojo/Category;", "app_debug"})
    public static abstract interface OnItemCategoryClicked {
        
        public abstract void onClickListener(@org.jetbrains.annotations.NotNull
        com.example.easyfood.data.pojo.Category category);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter$OnLongCategoryClick;", "", "onCategoryLongCLick", "", "category", "Lcom/example/easyfood/data/pojo/Category;", "app_debug"})
    public static abstract interface OnLongCategoryClick {
        
        public abstract void onCategoryLongCLick(@org.jetbrains.annotations.NotNull
        com.example.easyfood.data.pojo.Category category);
    }
}