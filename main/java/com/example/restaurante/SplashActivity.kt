package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
//O splash é uma tela com tempo definido
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //Envia e processa objetos
        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this,PedidoActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        },2000)

    }
}