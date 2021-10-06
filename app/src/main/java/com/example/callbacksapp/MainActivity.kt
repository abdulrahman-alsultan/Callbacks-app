package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "Activity1"
        Log.d("Activity1: ", "onCreate: ")
        Toast.makeText(this, "onCreate 1 Activity", Toast.LENGTH_SHORT).show()

        val btn = findViewById<Button>(R.id.start_activity)

        btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }
        })
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity1: ", "onPause: ")
        Toast.makeText(this, "onPause 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity1: ", "onDestroy: ")
        Toast.makeText(this, "onDestroy 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity1: ", "onStop: ")
        Toast.makeText(this, "onStop 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity1: ", "onStart: ")
        Toast.makeText(this, "onStart 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity1: ", "onRestart: ")
        Toast.makeText(this, "onRestart 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity1: ", "onResume: ")
        Toast.makeText(this, "onResume 1 Activity", Toast.LENGTH_SHORT).show()
    }
}