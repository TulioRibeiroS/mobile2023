package com.example.terceiraatividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.IvDonut).setOnClickListener{
            Toast.makeText(this,"Add Donut", Toast.LENGTH_LONG).show()
        }

        findViewById<View>(R.id.IvFroyo).setOnClickListener{
            Toast.makeText(this,"Add Froyo", Toast.LENGTH_LONG).show()
        }

        findViewById<View>(R.id.IvIcecream).setOnClickListener{
            Toast.makeText(this,"Add Ice cream", Toast.LENGTH_LONG).show()
        }
    }
}
