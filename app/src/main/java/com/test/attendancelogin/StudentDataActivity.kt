package com.test.attendancelogin

import android.graphics.Color.BLUE
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_student_data.*
import kotlinx.android.synthetic.main.activity_welcome.*

class StudentDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_data)

        absentButton.setOnClickListener{
            absentButton.setTextColor(BLUE)
        }
    }
}