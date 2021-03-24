package com.test.attendancelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun userLogin(view: View) {
//        val et: EditText = findViewById(R.id.uname);
//        et.editableText.toString().also { et.text = it }
//        val pass: EditText = findViewById(R.id.upass);
//        upass.editableText.toString().also { et.text = it }
                val i = Intent(this, WelcomeActivity::class.java)
                startActivity(i)
            }
}
