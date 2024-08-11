package com.example.easyfood.ui.activites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/easyfood/ui/activites/MealDetailesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/easyfood/databinding/ActivityMealDetailesBinding;", "detailsMVVM", "Lcom/example/easyfood/mvvm/DetailsMVVM;", "dtMeal", "Lcom/example/easyfood/data/pojo/MealDetail;", "mealId", "", "mealStr", "mealThumb", "ytUrl", "deleteMeal", "", "getMealInfoFromIntent", "isMealSavedInDatabase", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveMeal", "setFloatingButtonStatues", "setTextsInViews", "meal", "setUpViewWithMealInformation", "showLoading", "stopLoading", "app_debug"})
public final class MealDetailesActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.easyfood.databinding.ActivityMealDetailesBinding binding;
    private com.example.easyfood.mvvm.DetailsMVVM detailsMVVM;
    private java.lang.String mealId = "";
    private java.lang.String mealStr = "";
    private java.lang.String mealThumb = "";
    private java.lang.String ytUrl = "";
    private com.example.easyfood.data.pojo.MealDetail dtMeal;
    
    public MealDetailesActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void deleteMeal() {
    }
    
    private final void setFloatingButtonStatues() {
    }
    
    private final boolean isMealSavedInDatabase() {
        return false;
    }
    
    private final void saveMeal() {
    }
    
    private final void showLoading() {
    }
    
    private final void stopLoading() {
    }
    
    private final void setTextsInViews(com.example.easyfood.data.pojo.MealDetail meal) {
    }
    
    private final void setUpViewWithMealInformation() {
    }
    
    private final void getMealInfoFromIntent() {
    }
}