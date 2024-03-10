package com.example.atakhodzhaev_m4_hw1.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.atakhodzhaev_m4_hw1.R
import com.example.atakhodzhaev_m4_hw1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var binding: FragmentSecondBinding?=null
    private val args by navArgs<SecondFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding?.mailGetter?.text=args.email
        binding?.passwordGetter?.text=args.password
    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}