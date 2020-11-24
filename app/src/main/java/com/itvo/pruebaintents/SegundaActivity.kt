package com.itvo.pruebaintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        abrirPrimeraActivity()
        validarDatosIngresados()

    }


    fun  abrirPrimeraActivity(){


        // EditText ya inicializado para que lo puedan utilizar.
        var etNombre: EditText = findViewById(R.id.etNombre)

        // TODO: CODIGO PARA IR A LA SEGUNDA ACTIVITY

    }


    fun validarDatosIngresados(){

    }


    /**
     * OTROS METODOS EXTRAS QUE HACEN FUNCIONAR EL EJERCICIO
     *
     * */
}