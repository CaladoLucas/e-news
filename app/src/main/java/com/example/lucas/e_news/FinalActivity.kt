package com.example.lucas.e_news

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.widget.Button

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val intent = Intent(this, NoticiaActivity::class.java)
        val pIntent = PendingIntent.getActivity(this, 1, intent, 0)
        val not = NotificationCompat.Builder(this, "id")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Nova Notícia")
                .setContentText("Clique aqui para visualizar")
                .setContentIntent(pIntent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.notify(1, not.build())

        findViewById<Button>(R.id.btnSair).setOnClickListener {
            this.finishAffinity()
        }
    }
}
