package com.example.swipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Nazhmi(view: View){
        val Nazhatie = Toast.makeText(this, "А не надо было жать! Лошок!", Toast.LENGTH_SHORT)
        Nazhatie.show()
    }



}