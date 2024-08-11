package com.example.easyfood.data.Retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\n\u001a\u00020\bH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\bH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/easyfood/data/Retrofit/ApiFood;", "", "getCategories", "Lretrofit2/Call;", "Lcom/example/easyfood/data/Models/CategoryList;", "getMealById", "Lcom/example/easyfood/data/Models/RandomMealResponse;", "id", "", "getMealByName", "s", "getMealsByCategory", "Lcom/example/easyfood/data/Models/MealsResponse;", "category", "getRandomMeal", "app_debug"})
public abstract interface ApiFood {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "categories.php")
    public abstract retrofit2.Call<com.example.easyfood.data.Models.CategoryList> getCategories();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "filter.php?")
    public abstract retrofit2.Call<com.example.easyfood.data.Models.MealsResponse> getMealsByCategory(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "i")
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "random.php")
    public abstract retrofit2.Call<com.example.easyfood.data.Models.RandomMealResponse> getRandomMeal();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "lookup.php?")
    public abstract retrofit2.Call<com.example.easyfood.data.Models.RandomMealResponse> getMealById(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "i")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "search.php?")
    public abstract retrofit2.Call<com.example.easyfood.data.Models.RandomMealResponse> getMealByName(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "s")
    java.lang.String s);
}