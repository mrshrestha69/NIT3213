package com.example.finalassignment.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalassignment.R
import com.example.finalassignment.activities.DetailActivity
import com.example.finalassignment.models.EntityDetails

class MyAdapter(
    private val entityList: List<EntityDetails>
) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseTitle: TextView = itemView.findViewById(R.id.textCourseTitle)
        val courseInstructor: TextView = itemView.findViewById(R.id.textInstructor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.each_entity_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = entityList.getOrNull(position)
        holder.courseTitle.text = course?.courseName?: "Unknown Title"
        holder.courseInstructor.text = course?.instructor?: "Unknown Instructor"

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                if (course != null) {
                    putExtra("courseCode", course.courseCode)
                }
                if (course != null) {
                    putExtra("courseTitle", course.courseName)
                }
                if (course != null) {
                    putExtra("courseInstructor", course.instructor)
                }
                if (course != null) {
                    putExtra("courseCredit", course.credits)
                }
                if (course != null) {
                    putExtra("courseDescription", course.description)
                }
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return entityList.size
    }
}
