package com.example.paintapp

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_SHORT).show()
        }

        blueBtn.setOnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_SHORT).show()
        }

        blackBtn.setOnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_SHORT).show()
        }

        eraser.setOnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_SHORT).show()
        }

    }
}