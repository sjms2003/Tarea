package com.example.deber_steven

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActividadConfiguracion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_configuracion)

        setSupportActionBar(findViewById(R.id.toolbar))

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    val intent = Intent(this, ActividadInicio::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_info -> {
                    val intent = Intent(this, ActividadInformacion::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_settings -> {
                    val intent = Intent(this, ActividadConfiguracion::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        val list_config : ListView = findViewById(R.id.listview_id)

        // Obtener el array de strings desde los recursos
        val arraySettings = resources.getStringArray(R.array.ArraySettings)

        // Crear un ArrayAdapter para enlazar los datos del array con el ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arraySettings)

        // Establecer el adapter en el ListView
        list_config.adapter = adapter

    }
}