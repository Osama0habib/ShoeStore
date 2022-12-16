package com.udacity.shoestore.modules

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.viewModel.ShoeViewModel


class ShoeDetailFragment : Fragment() {

    lateinit var binding : FragmentShoeDetailBinding
    private val viewModel: ShoeViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_detail,container,false)
//         viewModel = ViewModelProvider(this).get(ShoeViewModel::class.java)
        binding.shoe = viewModel.shoeModel
        binding.cancelButton.setOnClickListener {
            view ->
            view.findNavController().popBackStack()
        }
        binding.SaveButton.setOnClickListener {
            view ->
//            println(viewModel.shoeModel.name)
                viewModel.addToShoes(viewModel.shoeModel)
            view.findNavController().navigateUp()
        }

        binding.imageView.setOnClickListener {
        }
        return binding.root
    }


}