package com.test.attendancelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_attendance_sheet.*
import kotlinx.android.synthetic.main.activity_welcome.view.*


class AttendanceSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance_sheet)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = AttendanceAdapter(items)
        recyclerView.adapter = adapter

//        // TextBox
//        val text: TextView = findViewById(R.id.text)
//        val intent = intent
//        val text.text = intent.getStringExtra("name")
//    }
//
       val date = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.text).apply {
            text = date
        }
    }
    private fun fetchData(): ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 1 until 100) {
            list.add("STUDENT $i")
        }
        return list
    }
}