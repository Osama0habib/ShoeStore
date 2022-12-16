package com.udacity.shoestore.utils.converters
import androidx.databinding.InverseMethod

object DoubleConverter {

    @InverseMethod("stringToDouble")
    @JvmStatic
    fun doubleToString(value: Double?): String?{
        return if(value != null){
            value?.toString()
        }else {
            null
        }
    }

    @JvmStatic
    fun stringToDouble(value: String?): Double? {
        return if (value.isNullOrEmpty()){
            null
        }else{
            value.toDouble()        }
    }

}