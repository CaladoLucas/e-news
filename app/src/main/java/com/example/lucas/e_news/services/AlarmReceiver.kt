package com.example.lucas.e_news.services

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings.Global.getString
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.example.lucas.e_news.MainActivity
import com.example.lucas.e_news.NoticiaActivity
import com.example.lucas.e_news.Noticias
import com.example.lucas.e_news.R
import java.util.*

class AlarmReceiver : BroadcastReceiver() {



    override fun onReceive(context: Context, intent: Intent) {

        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        class AlarmReceiver : BroadcastReceiver() {

            override fun onReceive(context: Context, intent: Intent) {
                // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
                val intent = Intent(context, NoticiaActivity::class.java)
                val pIntent = PendingIntent.getActivity(context, 1, intent, 0)
                val not = NotificationCompat.Builder(context, "id")
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle("Nova Notícia")
                        .setContentText("Clique aqui para visualizar")
                        .setContentIntent(pIntent)
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setAutoCancel(true)

                val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

                notificationManager.notify(1, not.build())

                Log.i("ALARME", "O alarme executou as: " + Date())
            }
        }
    }
}
