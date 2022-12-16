package com.udacity.shoestore.modules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionBinding


class InstructionFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding : FragmentInstructionBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_instruction,container,false)
            binding.Start.setOnClickListener {
                view -> view.findNavController().navigate(R.id.action_instructionFragment_to_shoeListingFragment)
            }
        return binding.root
    }


}