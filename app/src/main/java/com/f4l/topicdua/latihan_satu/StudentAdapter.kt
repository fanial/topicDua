package com.f4l.topicdua.latihan_satu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.f4l.topicdua.R
import com.f4l.topicdua.databinding.ItemStudentBinding

class StudentAdapter(var list : ArrayList<DataStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>(){
    class ViewHolder(val binding : ItemStudentBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(itemDataStudent: DataStudent){
            binding.dataStudent = itemDataStudent
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

