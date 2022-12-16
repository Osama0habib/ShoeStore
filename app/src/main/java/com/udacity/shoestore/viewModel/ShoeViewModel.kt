package com.udacity.shoestore.viewModel

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel : ViewModel() {



    private val _Shoes =
        MutableLiveData<List<Shoe>>()

    val shoes: LiveData<List<Shoe>>
        get() = _Shoes
     var shoeModel = Shoe()

    init {
        _Shoes.value = listOf(Shoe("sport x", 43.0, "nike", "asdbjhbajsd"),
            Shoe("sport x", 43.0, "nike", "asdbjhbajsd"),
            Shoe("sport x", 43.0, "nike", "asdbjhbajsd"),
            Shoe("sport x", 43.0, "nike", "asdbjhbajsd"))
        println("ShoeViewModel Initialized")
    }

    fun addToShoes(shoe: Shoe){
        println(shoe.name)
        _Shoes.value = _Shoes.value?.plus(shoe) ?: listOf(shoe)
        shoeModel = Shoe()
        println(_Shoes.value?.size)
    }




}