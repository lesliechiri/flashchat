package com.example.flashchat


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.registration.*

class RegistrationActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
        auth = FirebaseAuth.getInstance()
        btnRegister.setOnClickListener {
            var email: String = etEmail.text.toString()
            var password: String = etPassword.text.toString()
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Log.d("login", "login with email was successful")
                        var intent = Intent(this, ChatActivity::class.java)
                        startActivity(intent)
                    } else {

                        Log.w("fail", "signInWithEmail:failure", task.exception)
                        Toast.makeText(
                            baseContext, "Authentication failed.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }



                    Toast.makeText(baseContext, email, Toast.LENGTH_LONG).show()

                }


        }


    }
}
