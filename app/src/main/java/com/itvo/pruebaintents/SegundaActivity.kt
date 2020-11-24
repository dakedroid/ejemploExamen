package com.itvo.pruebaintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        obtenerDatosDePrimeraActivity()
        abrirPrimeraActivity()

    }

    fun obtenerDatosDePrimeraActivity(){

        // TODO: CODIGO PARA OBTENER DATOS DE LA PRIMERA ACTIVITY



        val txtNombreOtenido: TextView = findViewById(R.id.NombreObtenido)

        var nombre  = intent.getStringExtra("nombre")

        txtNombreOtenido.text = nombre





    }


    fun  abrirPrimeraActivity(){


        // TODO: CODIGO PARA REGRESAR A LA PRIMERA ACTIVITY


        val btnRegresar: Button = findViewById(R.id.btnRegresar)
        val txtRegresar: TextView = findViewById(R.id.txtRegresar)

        btnRegresar.setOnClickListener {
            val intent = Intent(this, PrimeraActivity::class.java)
            startActivity(intent)
        }

        txtRegresar.setOnClickListener {
            val intent = Intent(this, PrimeraActivity::class.java)
            startActivity(intent)
        }





    }


    fun validarDatosIngresados(){

        // CODIGO QUE NO HAY QUE PREOCUPARSE
    }


    /**
     * OTROS METODOS EXTRAS QUE HACEN FUNCIONAR EL EJERCICIO
     *
     * */
}