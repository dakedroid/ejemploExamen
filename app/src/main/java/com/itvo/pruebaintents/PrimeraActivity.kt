package com.itvo.pruebaintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PrimeraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera)

        abrirSegundaActivity()
        validarDatosIngresados()
    }


    fun  abrirSegundaActivity(){

        // TODO: CODIGO PARA REGRESAR A LA PRIMERA ACTIVITY

    }


    fun validarDatosIngresados(){

    }


    /**
     * OTROS METODOS EXTRAS QUE HACEN FUNCIONAR EL EJERCICIO
     *
     * */
}