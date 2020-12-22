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

    fun Ne_Zhmi(view: View){
        val Nazhatie1 = Toast.makeText(this, "Все таки нажал, а тебя не учили слушаться старших?!", Toast.LENGTH_SHORT)
        Nazhatie1.show()
    }
    fun Fifty_fifty(view: View){
        val Nazhatie2 = Toast.makeText(this, "Фууууууууууууууууу!", Toast.LENGTH_SHORT)
        Nazhatie2.show()
    }


}