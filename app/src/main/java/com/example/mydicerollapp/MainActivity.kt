package com.example.mydicerollapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var i:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      VIEW INFLATE
        val txtCount:TextView = findViewById(R.id.txtCount)
        val txtRoll:TextView = findViewById(R.id.txtRolling)
        val btnCount:Button = findViewById(R.id.btnCount)
        val btnRoll:Button = findViewById(R.id.btnRool)

//      BUTTON  ACTION
        btnRoll.setOnClickListener {
            txtRoll.text = (1..6).random().toString()
        }

        btnCount.setOnClickListener {
            if (i>6) {
                i = 0
                txtCount.text = i.toString()
            } else txtCount.text = i++.toString()
        }
    }
}