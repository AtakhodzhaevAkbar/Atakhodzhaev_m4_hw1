package com.example.atakhodzhaev_m4_hw1.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.atakhodzhaev_m4_hw1.R
import com.example.atakhodzhaev_m4_hw1.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener(){
        binding.continueBtn.setOnClickListener {
            val email = binding.mail.text.toString()
            val password = binding.password.text.toString()
            val action = MainFragmentDirections.actionMainFragmentToSecondFragment(email, password)
            findNavController().navigate(action)
        }
    }
}
