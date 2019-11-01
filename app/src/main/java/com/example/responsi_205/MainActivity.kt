package com.example.responsi_205

import android.content.Intent;
import android.os.Bundle;
import android.view.AbsSavedState
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //deklarasi variabel untuk komponen
    private lateinit var editUsername: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button

    private var user = "rizki"
    private var password = "1234"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUsername = this.edt_username
        editPassword = this.edt_password
        btnLogin = this.btn_login
        btnRegister = this.btn_register

        btnLogin.setOnClickListener {
            if (editUsername.text.toString().equals(user) && editPassword.text.toString().equals(password)){
                intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }

        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, register::class.java)
                .putExtra("username", editUsername.text)
                .putExtra("password", editPassword.text))
        }
    }
}