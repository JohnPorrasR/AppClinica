package com.johnporrasr.appclinica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var txtCiudad:TextView? = null
    var txtGrados:TextView? = null
    var txtEstado:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCiudad = findViewById(R.id.txtCiudad)
        txtGrados = findViewById(R.id.txtGrados)
        txtEstado = findViewById(R.id.txtEstado)

        val ciudad = intent.getStringExtra("com.johnporrasr.appclinica.ciudades.CIUDAD")

        val ciudadmx = Ciudad("Ciudad de México", 15, "Nublado")
        val ciudadbe = Ciudad("Ciudad de Berlin", 30, "Soleado")

        if(ciudad == "ciudad-mexico")
        {
            txtCiudad?.text = ciudadmx.nombre
            txtGrados?.text = ciudadmx.grados.toString() + "°"
            txtEstado?.text = ciudadmx.estado
        }
        else if(ciudad == "ciudad-berlin")
        {
            txtCiudad?.text = ciudadbe.nombre
            txtGrados?.text = ciudadbe.grados.toString() + "°"
            txtEstado?.text = ciudadbe.estado
        }
        else
        {
            Toast.makeText(this, "Sin información", Toast.LENGTH_SHORT).show()
        }

    }
}
