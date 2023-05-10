package com.example.segundaatividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.graphics.Color
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cor: Int = Color.GRAY

        findViewById<Button>(R.id.BtRed).setOnClickListener{
            cor = Color.RED
        }

        findViewById<Button>(R.id.BtYellow).setOnClickListener{
            cor = Color.YELLOW
        }

        findViewById<Button>(R.id.BtGreen).setOnClickListener{
            cor = Color.GREEN
        }

        findViewById<TextView>(R.id.TvbBoxOne).setOnClickListener {
            it.setBackgroundColor(cor)
        }

        findViewById<TextView>(R.id.TvbBoxTwo).setOnClickListener {
            it.setBackgroundColor(cor)
        }

        findViewById<TextView>(R.id.TvbBoxThree).setOnClickListener {
            it.setBackgroundColor(cor)
        }

        findViewById<TextView>(R.id.TvbBoxFour).setOnClickListener {
            it.setBackgroundColor(cor)
        }

        findViewById<TextView>(R.id.TvbBoxFive).setOnClickListener {
            it.setBackgroundColor(cor)
        }

    }
}