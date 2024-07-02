package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val pesostr: String = EdtPeso.text.toString()
            val alturastr: String = EdtAltura.text.toString()

            if(pesostr =="" || alturastr ==""){

            Snackbar.make(EdtPeso,
                "Preencha todos os campos",
                Snackbar.LENGTH_LONG)

                .show()

            }else{

                val peso = pesostr.toFloat()
                val altura = alturastr.toFloat()

                val alturaQ2 = altura*altura
                val resultado = peso/alturaQ2

                println(resultado)
            }

        }
    }
}