package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperar os componentes do EditText
        // Criar uma variavel e associar o componente de UI EditText
        // recuperar o botao da tela

        val EdtPeso = findViewById<TextInputEditText>(R.id.editTexto_peso)
        val EdtAltura = findViewById<TextInputEditText>(R.id.editTexto_altura)
        val btnCaular = findViewById<Button>(R.id.btn_calcular)

        btnCaular.setOnClickListener {
            val peso = EdtPeso.text
            val altura = EdtAltura.text

            println(altura)



        }
    }
}