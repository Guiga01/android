package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameET : EditText
    lateinit var yourNameIsTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

  fun enviarNomeParaTextView(View : View){
      nameET = findViewById(R.id.nameET)
      yourNameIsTV = findViewById(R.id.myNameIsTV)
      val valorDoEditText = nameET.text
      yourNameIsTV.text = valorDoEditText
      yourNameIsTV.visibility = android.view.View.VISIBLE

    }
}