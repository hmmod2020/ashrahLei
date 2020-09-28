package com.example.ashrahlei

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.afollestad.materialdialogs.MaterialDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        var int1=Intent(this,new_account::class.java)
        var int2=Intent(this,user_main::class.java)
        var dl= dialog(this,R.layout.load)
        var dl2= dialog(this,R.layout.load2)
        login_btn.setOnClickListener {
                dl.startDialog()

                var hr=Handler()
            hr.postDelayed({
                dl.dissDialog()
                if (testText(user_name_login.text.toString(),"hmmod")&&(testText(password_login.text.toString(),"12345"))){
                    startActivityForResult(int2,1)

                }else{
                    dl2.startDialog()

                    hr.postDelayed({

                        dl2.dissDialog()

                    },3000)
                }
            }
                ,4000)
        }

        createAccount.setOnClickListener {
            startActivity(int1)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==1&&resultCode==Activity.RESULT_OK){
////////
            //dont uesed//////////////////////////
///////
        }
    }
    private fun testText(str:String, str1: String):Boolean
    {
        return str==str1
    }
    private fun getVar(str:String):String
    {
        return str
    }
}
