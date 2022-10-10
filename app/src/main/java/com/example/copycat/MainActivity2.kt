package com.example.copycat

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.copycat.R.id.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(button1).setOnClickListener(){
            Toast.makeText(this@MainActivity2,"Stay Tuned!!!", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(button2).setOnClickListener(){
            finish()
        }
    }
}