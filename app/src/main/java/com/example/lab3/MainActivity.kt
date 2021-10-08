package com.example.lab3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun go(view: View?)
    {
        val newIntent = Intent(this, MainActivity2::class.java)
        startActivity(newIntent)
    }
}