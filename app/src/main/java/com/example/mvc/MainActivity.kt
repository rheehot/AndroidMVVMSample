package com.example.mvc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var model: Model
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View
        textView = findViewById<TextView>(R.id.textView)
        button = findViewById<Button>(R.id.button)
        textView.setTextColor(ContextCompat.getColor(this,R.color.black))

        // Controller
        var selected = false
        model = Model()
        textView.text = model.unselectedString
        button.text = model.unselectedString
        button.setOnClickListener {
            selected = !selected
            textView.text = if (selected) model.selectedString else model.unselectedString
            button.text = if (selected) model.selectedString else model.unselectedString

        }


    }
}