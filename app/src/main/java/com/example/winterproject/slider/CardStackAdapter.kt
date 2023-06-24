package com.example.winterproject.slider

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.winterproject.R
import com.example.winterproject.auth.UserDataModel
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import java.lang.System.load

class CardStackAdapter(val context : Context, val items : List<UserDataModel>) : RecyclerView.Adapter<CardStackAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardStackAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.item_card, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: CardStackAdapter.ViewHolder, position: Int) {
        holder.binding(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.findViewById<ImageView>(R.id.profileImageArea)
        val nickname = itemView.findViewById<TextView>(R.id.itemNickname)
        val age = itemView.findViewById<TextView>(R.id.itemAge)
        val city = itemView.findViewById<TextView>(R.id.itemCity)
        val job = itemView.findViewById<TextView>(R.id.itemJob)
        val introduction = itemView.findViewById<TextView>(R.id.itemIntroduction)
        val arrowright = itemView.findViewById<ImageView>(R.id.rightarrow)
        val arrowleft = itemView.findViewById<ImageView>(R.id.leftarrow)

        fun binding(data : UserDataModel) {

            val storageRef = Firebase.storage.reference.child(data.uid + ".png")
            storageRef.downloadUrl.addOnCompleteListener(OnCompleteListener { task ->

                if(task.isSuccessful) {
                    Glide.with(context)
                        .load(task.result)
                        .into(image)

                }

            })
            arrowright.setColorFilter(Color.parseColor("#55cc0000"))
            arrowleft.setColorFilter(Color.parseColor("#553333ff"))
            nickname.text = "이름 : " + data.nickname
            age.text = "나이 : " + data.age
            city.text = "지역 : " + data.city
            job.text = "직업 : " + data.job
            introduction.text = "소개 : " + data.introduction

        }

    }


}