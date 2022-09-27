package com.bignerdranch.android.practice9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    private lateinit var button: Button
    private lateinit var fio: EditText
    private lateinit var age: EditText
    private lateinit var sex: EditText
    private lateinit var phoneNumber: EditText
    private lateinit var email: EditText
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        fio = findViewById(R.id.editTextTextPersonName)
        age = findViewById(R.id.editTextTextPersonName2)
        sex = findViewById(R.id.editTextTextPersonName3)
        phoneNumber = findViewById(R.id.editTextTextPersonName4)
        email = findViewById(R.id.editTextTextPersonName5)
        button.isEnabled = false
        fio.setOnClickListener{
            button.isEnabled = (fio.text.isNotEmpty() && age.text.isNotEmpty() && sex.text.isNotEmpty()
                    && phoneNumber.text.isNotEmpty() && email.text.isNotEmpty())
        }

        age.setOnClickListener{
            button.isEnabled = (fio.text.isNotEmpty() && age.text.isNotEmpty() && sex.text.isNotEmpty()
                    && phoneNumber.text.isNotEmpty() && email.text.isNotEmpty())
        }

        sex.setOnClickListener{
            button.isEnabled = (fio.text.isNotEmpty() && age.text.isNotEmpty() && sex.text.isNotEmpty()
                    && phoneNumber.text.isNotEmpty() && email.text.isNotEmpty())
        }

        phoneNumber.setOnClickListener{
            button.isEnabled = (fio.text.isNotEmpty() && age.text.isNotEmpty() && sex.text.isNotEmpty()
                    && phoneNumber.text.isNotEmpty() && email.text.isNotEmpty())
        }

        email.setOnClickListener{
            button.isEnabled = (fio.text.isNotEmpty() && age.text.isNotEmpty() && sex.text.isNotEmpty()
                    && phoneNumber.text.isNotEmpty() && email.text.isNotEmpty())
        }
        button.setOnClickListener{
            if(sex.text.toString() == "m")
            {
                val intent = Intent(this, SecondScreen::class.java)
                intent.putExtra("sex", "man")
                startActivity(intent)
            }

            if(sex.text.toString() == "w")
            {
                val intent = Intent(this, SecondScreen::class.java)
                intent.putExtra("sex", "woman")
                startActivity(intent)
            }
        }
    }
}