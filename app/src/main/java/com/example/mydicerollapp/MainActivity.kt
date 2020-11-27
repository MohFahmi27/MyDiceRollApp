package com.example.mydicerollapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.mydicerollapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        THIS WILL CREATE BINDING OBJECT
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//      BUTTON  ACTION
        binding.btnRool.setOnClickListener {
            binding.imgDice.setImageResource(getRandomImage())
            binding.imgDice2.setImageResource(getRandomImage())
        }
    }

    private fun getRandomImage(): Int {
        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}