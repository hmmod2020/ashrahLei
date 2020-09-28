package com.example.ashrahlei

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.card_user.view.*

class adb (var myData:ArrayList<user_show>):RecyclerView.Adapter<adb.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view =LayoutInflater.from(parent.context).inflate(R.layout.card_user,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return myData.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position%2==0) {
            holder.card2.setCardBackgroundColor(Color.parseColor("#FFE6E1"))
            holder.btn.setBackgroundResource(R.drawable.send2)
        }else{
            holder.card2.setCardBackgroundColor(Color.parseColor("#DCE9FC"))
            holder.btn.setBackgroundResource(R.drawable.send)
        }
        var data=myData.get(position)
        holder.Name.text=data.Name
        holder.Location.text=data.Location
       holder.personalPic.setImageResource(data.personalPic)
      holder.requiredSlills.text=data.requiredSlills
       holder.sup1.text= data.subject[0]
        holder.sup2.text= data.subject[1]
        holder.sup3.text= data.subject[2]
        holder.sup4.text= data.subject[3]

    }

    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){


     var Name=itemView.findViewById(R.id.nameUr) as TextView
     var  Location=itemView.findViewById(R.id.locationUr) as TextView
     var  personalPic=itemView.findViewById(R.id.userPic) as CircleImageView
     var   requiredSlills=itemView.findViewById(R.id.riqSub) as TextView
     var sup1=itemView.findViewById(R.id.sub1) as TextView
     var sup2=itemView.findViewById(R.id.sub2) as TextView
     var sup3=itemView.findViewById(R.id.sub3) as TextView
     var sup4=itemView.findViewById(R.id.sub4) as TextView
     var card1=itemView.findViewById(R.id.card1) as CardView
     var card2=itemView.findViewById(R.id.card2) as CardView
     var btn =itemView.findViewById(R.id.sendOrder) as Button

    }


}