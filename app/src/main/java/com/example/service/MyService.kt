package com.example.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.Toast

class MyService:Service(){

    /*
    * Variable in class
    * */
    lateinit var player: MediaPlayer


    override fun onBind(p0: Intent?): IBinder? {
        Toast.makeText(this,"On Bind",Toast.LENGTH_SHORT).show()
        return null
    }

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this,R.raw.my_life)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }
}