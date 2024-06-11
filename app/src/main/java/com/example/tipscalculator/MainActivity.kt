package com.example.tipscalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val btnClean: Button = findViewById(R.id.btn_clean_2)
            val btnCalculate: Button = findViewById(R.id.btn_calculate)
            val edtTotal: TextInputEditText = findViewById(R.id.tie_total)
            val edtNumPeople: TextInputEditText = findViewById(R.id.tie_num_people)

            btnClean.setOnClickListener {
                println("Murilo1 " + edtTotal.text)
                println("Murilo1 " + edtNumPeople.text)
            }
    }
}