package com.example.copycat

import android.content.Intent
import android.os.Bundle
//import android.view.MotionEvent
//import android.view.MotionEvent.ACTION_BUTTON_PRESS
//import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.forEach
import com.example.copycat.R.id.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(button).setOnClickListener(){
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        findViewById<RelativeLayout>(relayout1).forEach {
            it.setOnClickListener(){
                Toast.makeText(this@MainActivity, "You've clicked the class button!", Toast.LENGTH_SHORT).show()
            }
            it.setOnLongClickListener(){
                Toast.makeText(this@MainActivity, "You've clicked the class button for a long time!", Toast.LENGTH_SHORT).show()
                true
            }
//            it.setOnTouchListener { v, event ->
//                when (event?.action) {
//                    MotionEvent.ACTION_HOVER_ENTER -> Toast.makeText(
//                        this@MainActivity,
//                        "You've hover the class button!",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//                v?.onTouchEvent(event) ?: true
//            }
        }
        findViewById<RelativeLayout>(relayout2).forEach {
            it.setOnClickListener(){
                Toast.makeText(this@MainActivity, "You've clicked the assignment button!", Toast.LENGTH_SHORT).show()
            }
            it.setOnLongClickListener(){
                Toast.makeText(this@MainActivity, "You've clicked the class button for a long time!", Toast.LENGTH_SHORT).show()
                true
            }
//            it.setOnTouchListener { v, event ->
//                when (event?.action) {
//                    MotionEvent.ACTION_HOVER_ENTER -> Toast.makeText(
//                        this@MainActivity,
//                        "You've hover the class button!",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//                v?.onTouchEvent(event) ?: true
//            }
        }
    }
}