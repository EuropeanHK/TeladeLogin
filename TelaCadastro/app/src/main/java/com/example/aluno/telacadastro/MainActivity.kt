package com.example.aluno.telacadastro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIncluir : Button = findViewById<Button>(R.id.btnIncluir)
        val btnLimpar : Button = findViewById<Button>(R.id.btnLimpar)


        btnLimpar.setOnClickListener(View.OnClickListener {
            val TxbNome = TxbNome.text.clear()
            val TxbEmail = TxbEmail.text.clear()
            val TxbLogin = TxbLogin.text.clear()
            val TxbSenha = TxbSenha.text.clear()
    })
    }

