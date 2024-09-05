package com.example.deber_steven

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class ActividadSecundaria : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_secundaria)

        val btn_siguiente2 : Button = findViewById(R.id.btn_siguiente2)
        btn_siguiente2.setOnClickListener{
            val intent = Intent(this, ActividadInicio::class.java)
            startActivity(intent)
        }
    }
}