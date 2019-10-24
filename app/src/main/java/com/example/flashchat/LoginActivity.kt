package com.example.flashchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener {
            var email: String = etEmail2.text.toString()
            var password: String = etPassword2.text.toString()

            Toast.makeText(baseContext, email, Toast.LENGTH_LONG).show()
        }
    }
}
