package com.example.myapp_test6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /* 핸들러 추가하기
       val handler: Handler()*/

        val intent = Intent(applicationContext, MainActivity::class.java)



        setContentView(R.layout.activity_intro)

    }
}