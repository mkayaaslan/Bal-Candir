package com.kayaaslan.viewpager2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {

    private val SPLASH_TIME : Long =1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()

        }
        ,SPLASH_TIME)

    }


}