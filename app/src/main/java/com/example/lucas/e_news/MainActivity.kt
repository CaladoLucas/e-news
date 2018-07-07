package com.example.lucas.e_news

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSim = findViewById<Button>(R.id.btnSim)
        var btnNao = findViewById<Button>(R.id.btnNao)

        btnSim.setOnClickListener{
            startActivity(Intent(this,HorarioActivity::class.java))
        }
        btnNao.setOnClickListener{
            this.finish()
        }
    }
}
