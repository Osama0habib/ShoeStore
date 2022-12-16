package com.udacity.shoestore.modules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentOnBoardingBinding


class OnBoardingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding : FragmentOnBoardingBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_on_boarding,container,false)

        binding.letsGoButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_onBoardingFragment_to_instructionFragment)
        }
        return  binding.root
    }


}