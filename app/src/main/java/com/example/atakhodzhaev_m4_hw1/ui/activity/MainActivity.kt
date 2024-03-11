package com.example.atakhodzhaev_m4_hw1.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.atakhodzhaev_m4_hw1.R.id.nav_host_fragment_activity_main
import com.example.atakhodzhaev_m4_hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding?=null
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(nav_host_fragment_activity_main) as NavHostFragment

        navController = navHostFragment.navController

        binding?.bottomNavigation?.setupWithNavController(navController)
    }
}