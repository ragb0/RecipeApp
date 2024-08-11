package com.example.easyfood.data.Retrofit

import com.example.easyfood.data.Models.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiFood {
    @GET("categories.php")
    fun getCategories(): Call<CategoryList>

    @GET("filter.php?")
    fun getMealsByCategory(@Query("i") category:String):Call<MealsResponse>

    @GET ("random.php")
    fun getRandomMeal():Call<RandomMealResponse>

    @GET("lookup.php?")
    fun getMealById(@Query("i") id:String):Call<RandomMealResponse>

    @GET("search.php?")
    fun getMealByName(@Query("s") s:String):Call<RandomMealResponse>
}