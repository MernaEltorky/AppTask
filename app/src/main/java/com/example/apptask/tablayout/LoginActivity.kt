package com.example.apptask.tablayout

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptask.R

class LoginActivity : AppCompatActivity() {

    var editTextEmail: EditText? = null
    var editTextPassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

         editTextEmail = findViewById<EditText>(R.id.login_et_email)
         editTextPassword = findViewById<EditText>(R.id.login_et_password)
    }

    fun login(view: View) {

        val email: String = editTextEmail?.getText().toString().trim({ it <= ' ' })
        val password = editTextPassword?.getText().toString().trim({ it <= ' ' })

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill all data ", Toast.LENGTH_LONG).show()
            return
        }

        if (password.length < 6) {
            Toast.makeText(this, "password should be at laste 6 charcters", Toast.LENGTH_LONG)
                .show()
            return
        }





    }
}