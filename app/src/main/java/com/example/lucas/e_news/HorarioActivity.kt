package com.example.lucas.e_news

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.AlarmManagerCompat
import android.widget.*
import java.text.SimpleDateFormat
import android.app.AlarmManager
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.Context.ALARM_SERVICE
import java.util.*
import android.content.BroadcastReceiver
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.example.lucas.e_news.services.AlarmReceiver


class HorarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horario)




        var rbManha= findViewById<RadioButton>(R.id.rbManha)
        var rbTarde= findViewById<RadioButton>(R.id.rbTarde)
        var rbNoite= findViewById<RadioButton>(R.id.rbNoite)
        var btnSalvar= findViewById<Button>(R.id.btnSalvar)

        rbManha.setOnClickListener{
            rbTarde.isChecked = false
            rbNoite.isChecked = false
        }
        rbTarde.setOnClickListener{
            rbManha.isChecked = false
            rbNoite.isChecked = false
        }
        rbNoite.setOnClickListener{
            rbTarde.isChecked = false
            rbManha.isChecked = false
        }
        btnSalvar.setOnClickListener {
            if(rbManha.isChecked == false && rbTarde.isChecked == false && rbNoite.isChecked == false){
                Toast.makeText(this,"Selecione um dos Horário!",Toast.LENGTH_SHORT).show()
            }else{
                if (rbManha.isChecked == true){
                    val alarmMgr = this.getSystemService(Context.ALARM_SERVICE) as AlarmManager

                    val intent = Intent(this, AlarmReceiver::class.java)
                    val alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

                    val calendar = Calendar.getInstance()
                    calendar.setTimeInMillis(System.currentTimeMillis())
                    calendar.set(Calendar.HOUR_OF_DAY, 9)
                    val inicio = calendar.getTimeInMillis()

                    val intervalo = (60 * 1000).toLong()

                    alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP, inicio, intervalo, alarmIntent)


                }
                if (rbTarde.isChecked == true){
                    val alarmMgr = this.getSystemService(Context.ALARM_SERVICE) as AlarmManager

                    val intent = Intent(this, AlarmReceiver::class.java)
                    val alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

                    val calendar = Calendar.getInstance()
                    calendar.setTimeInMillis(System.currentTimeMillis())
                    calendar.set(Calendar.HOUR_OF_DAY, 15)
                    val inicio = calendar.getTimeInMillis()

                    val intervalo = (60 * 1000).toLong()

                    alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP, inicio, intervalo, alarmIntent)


                }
                if (rbNoite.isChecked == true){
                    val alarmMgr = this.getSystemService(Context.ALARM_SERVICE) as AlarmManager

                    val intent = Intent(this, AlarmReceiver::class.java)
                    val alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

                    val calendar = Calendar.getInstance()
                    calendar.setTimeInMillis(System.currentTimeMillis())
                    calendar.set(Calendar.HOUR_OF_DAY, 19)
                    val inicio = calendar.getTimeInMillis()

                    val intervalo = (60 * 1000).toLong()

                    alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP, inicio, intervalo, alarmIntent)
                }


                startActivity(Intent(this,FinalActivity::class.java))
            }
        }

    }




}
