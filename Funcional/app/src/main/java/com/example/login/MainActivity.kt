package com.example.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    var rellay1: RelativeLayout? = null
    var rellay2: RelativeLayout? = null
    var handler: Handler = Handler()
    var runnable:Runnable = Runnable {

            rellay1!!.visibility = View.VISIBLE
            rellay2!!.visibility = View.VISIBLE

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rellay1 = findViewById<RelativeLayout>(R.id.rellay1)
        rellay2 = findViewById<RelativeLayout>(R.id.rellay2)

        handler.postDelayed(runnable, 2500) //Waiting time

    }

    var username = findViewById<EditText>(R.id.username)
    var password = findViewById<EditText>(R.id.pass)



}
