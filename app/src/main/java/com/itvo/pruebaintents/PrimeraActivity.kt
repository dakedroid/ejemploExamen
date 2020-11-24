package com.itvo.pruebaintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PrimeraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera)

        abrirSegundaActivity()
        validarDatosIngresados()
    }


    fun  abrirSegundaActivity(){

        // EditText ya inicializado para que lo puedan utilizar.
        val etNombre: EditText = findViewById(R.id.etNombre)
        val btnEnviar: Button = findViewById(R.id.btnEnviar)
        val txtEnviar: TextView = findViewById(R.id.txtEnviar)

        // TODO: CODIGO PARA IR A LA SEGUNDA ACTIVITY


        val nombre = etNombre.text.toString()

        btnEnviar.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("nombre", nombre)
            startActivity(intent)
        }

        txtEnviar.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("nombre", nombre)
            startActivity(intent)
        }

    }


    fun validarDatosIngresados(){

        // CODIGO QUE NO HAY QUE PRECUPARSE
    }


    /**
     * OTROS METODOS EXTRAS QUE HACEN FUNCIONAR EL EJERCICIO
     *
     * */
}