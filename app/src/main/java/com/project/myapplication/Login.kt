package com.project.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById(R.id.txt1) as EditText
        val pass = findViewById(R.id.txt2) as EditText

        val loginClick  = findViewById(R.id.btnLogin) as Button
        loginClick.setOnClickListener{
            val ema: String = email.text.toString()
            val pwd: String = pass.text.toString()

            if(ema.trim().length == 0) {
                Toast.makeText(
                    applicationContext,
                    "Email field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }
            if(pwd.trim().length == 0) {
                Toast.makeText(applicationContext, "Password cannot be empty", Toast.LENGTH_SHORT)
                    .show()
            }
            if(ema.equals("abc@xyz.com")&&(pwd.equals("123456"))){
                val intent = Intent(this,Home::class.java)
                startActivity(intent)


            }else{
                Toast.makeText(applicationContext,"Wrong email or password",Toast.LENGTH_SHORT).show()
            }
        }
    }

        }
