package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
     //Carrega a variável binding com essa página
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //Usando intent
        val i = intent
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n"

        //Recebe o texto de confirmação do pedido
        binding.textResumo.text = texto

    }
}