package com.test.attendancelogin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_welcome.view.*

class AttendanceAdapter(private val items: ArrayList<String>): RecyclerView.Adapter<AttendanceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttendanceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_student_data, parent,false)

        return AttendanceViewHolder(view)
    }

    override fun onBindViewHolder(holder: AttendanceViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleView.text = currentItem
        holder.present
        holder.absent

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class AttendanceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.student)
    val present: Button = itemView.findViewById(R.id.presentButton)
    val absent: Button = itemView.findViewById(R.id.absentButton)
}
interface AttendanceButton {

}