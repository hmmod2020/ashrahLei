package com.example.ashrahlei

import android.app.Activity
import android.view.ViewGroup
import com.afollestad.materialdialogs.MaterialDialog

class dialog (var activity: Activity, var layout:Int) {
    var dialog  = MaterialDialog(activity)

    fun startDialog (){
        var inf = activity.layoutInflater.inflate(layout,null)
        dialog.setContentView(inf)
        dialog.cancelable(false)

        dialog.show()
  // dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
    fun dissDialog(){
        dialog.dismiss()
    }

    fun setLayout(Width:Int,hiate:Int){
        dialog.window!!.setLayout(Width,hiate)
    }


}