package com.udacity.shoestore.modules

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView

import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListingBinding
import com.udacity.shoestore.databinding.ListItemBinding
import com.udacity.shoestore.viewModel.ShoeViewModel
import kotlinx.android.synthetic.main.list_item.*
import kotlinx.android.synthetic.main.list_item.view.*
import java.security.Provider


class ShoeListingFragment : Fragment() {
    lateinit var binding : FragmentShoeListingBinding
    private val viewModel: ShoeViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        println("ONCreateView Called")
//        val viewModel = ViewModelProvider(this).get(ShoeViewModel::class.java)

        binding=  DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_listing, container, false)
        binding.floatingActionButton.setOnClickListener {
                view ->
            view.findNavController().navigate(R.id.action_shoeListingFragment_to_shoeDetailFragment)
        }
        viewModel.shoes.observe(viewLifecycleOwner, Observer {
            for (shoe in it) {
                println(shoe.name)
                val listItemBinding: ListItemBinding =
                    DataBindingUtil.inflate(inflater, R.layout.list_item, linearItem, false)
                listItemBinding.shoe = shoe
//                listItemBinding.nameText.text = shoe.name
//                listItemBinding.companyText.text = shoe.company
                binding.shoeListLinear.addView(listItemBinding.root)

            }

        })
        setHasOptionsMenu(true)

        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.over_flow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.loginFragment2 -> view?.findNavController()?.navigateUp()


        }
        return super.onOptionsItemSelected(item)
    }

}