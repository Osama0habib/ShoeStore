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


class LoginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login,container,false)

        binding.LoginButton.setOnClickListener {
            view ->
            view.findNavController().navigate(R.id.action_loginFragment2_to_onBoardingFragment)
        }
        binding.newUserLogin.setOnClickListener {
                view ->
            view.findNavController().navigate(R.id.action_loginFragment2_to_onBoardingFragment)
        }
        return binding.root
    }


}