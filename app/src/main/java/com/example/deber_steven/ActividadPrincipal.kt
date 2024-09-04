package com.example.deber_steven

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActividadPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        val button : Button = findViewById(R.id.btn_siguiente)
        button.setOnClickListener {
            val intent = Intent(this, ActividadSecundaria::class.java)
            startActivity(intent)
        }
    }
}