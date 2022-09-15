package com.f4l.topicdua.latihan_satu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.f4l.topicdua.R
import com.f4l.topicdua.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_student)

        val listStudent = arrayListOf(
            DataStudent("Fani", "20110021", R.drawable.ic_launcher_foreground),
            DataStudent("Yunus", "20110180", R.drawable.ic_launcher_foreground),
        )

        binding.rvStudent.adapter = StudentAdapter(listStudent)
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}