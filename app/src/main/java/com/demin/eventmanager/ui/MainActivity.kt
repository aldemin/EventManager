package com.demin.eventmanager.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.demin.eventmanager.R

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavController()
    }

    private fun initNavController() {
        navController = findNavController(R.id.ac_main_nav_host)
    }
}