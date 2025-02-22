package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
//Criação da variável binding que servirá para manipular a tela.
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Carrega a variável junto com o gradle

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Cria um botão "entrar"

        binding.buttonEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()
            //Verificação de nome e senha

            if (username.equals("abc") && password.equals("123")) {
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("username", username)
                startActivity(i)
                finish()
            } else {
                //Mensagem de erro na tela
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}