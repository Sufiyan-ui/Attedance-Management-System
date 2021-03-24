package com.test.attendancelogin

import android.content.Intent
import android.graphics.Color
import android.icu.text.DateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.CalendarView
import kotlinx.android.synthetic.main.activity_welcome.*
import java.util.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val calendar = Calendar.getInstance()

        val calendarView: CalendarView = findViewById(R.id.calendar)
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // set the calendar date as calendar view selected date
            calendar.set(year,month,dayOfMonth)
            // set this date as calendar view selected date
            calendarView.date = calendar.timeInMillis

            // format the calendar view selected date
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            "Date changed\n".also { date.text = it }
            date.append(dateFormatter.format(calendar.time))
            date.setTextColor(Color.WHITE)
        }
        // button click listener
        button.setOnClickListener {
            // get calendar view selected date
            val selectedDate:Long = calendarView.date

            // set the calendar date as calendar view selected date
            calendar.timeInMillis = selectedDate

            // format the calendar view selected date
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            "Selected date\n".also { date.text = it }
            date.append(dateFormatter.format(calendar.time))
            val datePass = dateFormatter.format(calendar.time).toString()
            date.setTextColor(Color.DKGRAY)
                val intent = Intent(this, AttendanceSheetActivity::class.java).apply{
                putExtra(EXTRA_MESSAGE, datePass)
                }
                startActivity(intent)
        }
    }

}