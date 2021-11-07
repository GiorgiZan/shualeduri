package com.example.shualerduri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttoncheck : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttoncheck = findViewById(R.id.buttonCheck)

        buttoncheck.setOnClickListener{
            Toast.makeText(this, "თქვენ არ გაქვთ ჯარიმები", Toast.LENGTH_SHORT).show()
        }

    }

}





