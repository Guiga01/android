package com.example.tcc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class cadastroTela : AppCompatActivity(){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.cadastro_fragment)
        }

    }

    fun sendMessage(view: View) {
        val intent = Intent(this, CadastrarProdutoFragment::class.java)
        startActivity(intent)
        }
    }






