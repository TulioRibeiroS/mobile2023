package com.example.primeiraatividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numero = 0;

        findViewById<Button>(R.id.btToastClick).setOnClickListener{
            Toast.makeText(this,"Hello World!",Toast.LENGTH_LONG).show()
        }


        findViewById<Button>(R.id.btCountClick).setOnClickListener {
            numero++
            findViewById<TextView>(R.id.tvCount).text = numero.toString()
        }
    }
}