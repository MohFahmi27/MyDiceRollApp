package com.example.mydicerollapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageDice: ImageView
    private lateinit var imageDice2: ImageView
    private lateinit var btnRoll: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      VIEW INFLATE
        imageDice = findViewById(R.id.imgDice)
        btnRoll = findViewById(R.id.btnRool)
        imageDice2 = findViewById(R.id.imgDice2)

//      BUTTON  ACTION
        btnRoll.setOnClickListener {
            imageDice.setImageResource(getRandomImage())
            imageDice2.setImageResource(getRandomImage())
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