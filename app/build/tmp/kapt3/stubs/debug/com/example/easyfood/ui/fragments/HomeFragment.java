package com.example.easyfood.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\u0016\u0010$\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\u0016\u0010(\u001a\u00020\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0&H\u0002J\b\u0010+\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/easyfood/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/easyfood/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/example/easyfood/databinding/FragmentHomeBinding;", "setBinding", "(Lcom/example/easyfood/databinding/FragmentHomeBinding;)V", "detailMvvm", "Lcom/example/easyfood/mvvm/DetailsMVVM;", "meal", "Lcom/example/easyfood/data/pojo/RandomMealResponse;", "mostPopularFoodAdapter", "Lcom/example/easyfood/adapters/MostPopularRecyclerAdapter;", "myAdapter", "Lcom/example/easyfood/adapters/CategoriesRecyclerAdapter;", "randomMealId", "", "cancelLoadingCase", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRandomLongClick", "onRndomMealClick", "onViewCreated", "view", "prepareCategoryRecyclerView", "preparePopularMeals", "setCategoryAdapter", "categories", "", "Lcom/example/easyfood/data/pojo/Category;", "setMealsByCategoryAdapter", "meals", "Lcom/example/easyfood/data/pojo/Meal;", "showLoadingCase", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.example.easyfood.data.pojo.RandomMealResponse meal;
    private com.example.easyfood.mvvm.DetailsMVVM detailMvvm;
    private java.lang.String randomMealId = "";
    @org.jetbrains.annotations.NotNull
    public static final com.example.easyfood.ui.fragments.HomeFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_ID = "com.example.easyfood.ui.fragments.idMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_NAME = "com.example.easyfood.ui.fragments.nameMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_THUMB = "com.example.easyfood.ui.fragments.thumbMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CATEGORY_NAME = " com.example.easyfood.ui.fragments.categoryName";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_STR = " com.example.easyfood.ui.fragments.strMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_AREA = " com.example.easyfood.ui.fragments.strArea";
    private com.example.easyfood.adapters.CategoriesRecyclerAdapter myAdapter;
    private com.example.easyfood.adapters.MostPopularRecyclerAdapter mostPopularFoodAdapter;
    public com.example.easyfood.databinding.FragmentHomeBinding binding;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.easyfood.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.example.easyfood.databinding.FragmentHomeBinding p0) {
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
    
    private final void onRndomMealClick() {
    }
    
    private final void onRandomLongClick() {
    }
    
    private final void showLoadingCase() {
    }
    
    private final void cancelLoadingCase() {
    }
    
    private final void setMealsByCategoryAdapter(java.util.List<com.example.easyfood.data.pojo.Meal> meals) {
    }
    
    private final void setCategoryAdapter(java.util.List<com.example.easyfood.data.pojo.Category> categories) {
    }
    
    private final void prepareCategoryRecyclerView() {
    }
    
    private final void preparePopularMeals() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/easyfood/ui/fragments/HomeFragment$Companion;", "", "()V", "CATEGORY_NAME", "", "MEAL_AREA", "MEAL_ID", "MEAL_NAME", "MEAL_STR", "MEAL_THUMB", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}