package com.example.lucas.e_news

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class NoticiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticia)

        var webView = findViewById<WebView>(R.id.webView)
        var noticia = Noticias()

        webView.loadUrl(noticia.aleatoriaNoticia())

        findViewById<Button>(R.id.btnSair).setOnClickListener {
            this.finish()
        }
    }
}
