package com.emanuel.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emanuel.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var layoutType: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.buttonVertical.setOnClickListener {
            layoutType = "vertical"
   //         startActivityList(layoutType)
        }

        binding.buttonHorizontal.setOnClickListener {
            layoutType = "horizontal"
 //           startActivityList(layoutType)
        }

        binding.buttonGrid.setOnClickListener {
            layoutType = "grid"
 //           startActivityList(layoutType)
        }
    }

}