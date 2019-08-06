package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View){
        var i = Intent(this,MyService::class.java)
        when(view.id){
            R.id.btnStart ->{
                startService(i)
            }
            R.id.btnStop ->{
                stopService(i)
            }
            R.id.btnActivity ->{
                startActivity(Intent(this,Main2Activity::class.java))
            }
        }
    }
}
