package com.example.easyfood.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.easyfood.data.Models.CategoryList
import com.example.easyfood.data.Models.Category
import com.example.easyfood.data.Retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryViewModel : ViewModel() {
    private var categories: MutableLiveData<List<Category>> = MutableLiveData<List<Category>>()

    init {
        getCategories()
    }

    private fun getCategories(){
        RetrofitInstance.foodApi.getCategories().enqueue(object : Callback<CategoryList>{
            override fun onResponse(call: Call<CategoryList>, response: Response<CategoryList>) {
                categories.value = response.body()!!.categories
            }

            override fun onFailure(call: Call<CategoryList>, t: Throwable) {
                Log.d(TAG,t.message.toString())
            }

        })
    }

    fun observeCategories():LiveData<List<Category>>{
        return categories
    }
}