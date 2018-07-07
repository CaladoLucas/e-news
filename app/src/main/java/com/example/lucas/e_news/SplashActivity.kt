package com.example.lucas.e_news

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //var intent = Intent(this,ServiceDelay::class.java)
        //startService(intent)
        var handle = Handler()
        handle.postDelayed(Runnable(){
            mostrar_main()
        },2000 )

    }
    fun mostrar_main(){
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
