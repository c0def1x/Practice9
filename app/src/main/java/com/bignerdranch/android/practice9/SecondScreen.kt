package com.bignerdranch.android.practice9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class SecondScreen : AppCompatActivity()
{
    private lateinit var picture:ImageView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        picture = findViewById(R.id.imageView)
        val sex = intent.getStringExtra("sex")
        if(sex == "man")
        {
            picture.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.man))
        }
        else if(sex == "woman")
        {
            picture.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.woman))
        }
    }
}