package com.example.responsi_205

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tv_username.text = intent.extras?.get("username").toString()
        tv_password.text = intent.extras?.get("password").toString()

        btn_kembali.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
