package com.example.apptask.login

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.apptask.R
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

   // var editTextEmail: EditText? = null
   //var editTextPassword:EditText? = null
    private val passwordPattern ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      //  editTextEmail = findViewById<EditText>(R.id.login_et_email)
      //  editTextPassword = findViewById<EditText>(R.id.login_et_password)

    }

    fun login(view: View) {

        val email: String
        email = login_et_email.text.toString().trim()
        val password = login_et_password.text.toString().trim()

        if (email.isEmpty()) {
            // Toast.makeText(this, "Please fill all data ", Toast.LENGTH_LONG).show()
            login_et_email.error="enter email"
            login_et_email.requestFocus()

        }

        if ( password.isEmpty() ) {
            // Toast.makeText(this, "Please fill all data ", Toast.LENGTH_LONG).show()
            login_et_password.error="enter password"
            login_et_password.requestFocus()

        }


        if ( password.matches(passwordPattern.toRegex())  ) {

        }

        else {

            login_et_password.error="password not strong"
            login_et_password.requestFocus()

        }


       /* RetrofitClient.instances.useLogin(email,password)
            .enqueue(object : Callback<LoginResponse> {
                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                }



                override fun onResponse(
                    call: Call<LoginResponse>,
                    response: Response<LoginResponse>
                ) {
                   if (!response.body()?.status!!) {

                    } else {
                       Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_LONG).show()
                   }
                }


            })*/

  } }


                //val intent = Intent(this, TabLayoutActivity::class.java)
                //startActivity(intent)

