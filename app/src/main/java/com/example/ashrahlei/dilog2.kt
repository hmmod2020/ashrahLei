package com.example.ashrahlei

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import com.afollestad.materialdialogs.MaterialDialog

class dilog2(var activity: Activity, var layout:Int) {
    var dialog  = Dialog(activity)
    var inf = activity.layoutInflater.inflate(layout,null,false)
    fun startDialog (){
        dialog.setContentView(inf)
         dialog.setCancelable(false)
        dialog.window!!.attributes.windowAnimations=R.style.anim
        dialog.show()

        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


    }

    fun dissDialog(){
        dialog.dismiss()
    }




}