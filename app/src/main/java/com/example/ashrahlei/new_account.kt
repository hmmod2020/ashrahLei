package com.example.ashrahlei

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.add_sub.*
import kotlinx.android.synthetic.main.add_sub.view.*
import kotlinx.android.synthetic.main.new_account.*
import kotlinx.android.synthetic.main.new_account.bahry
import kotlinx.android.synthetic.main.new_account.khartoum
import kotlinx.android.synthetic.main.new_account.omdurman
import kotlinx.android.synthetic.main.search.*
import java.lang.Exception
import java.util.ArrayList

class new_account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onResume() {
        var fillOut=dilog2(this,R.layout.req)
        var wrongPass =dilog2(this,R.layout.wron_pass)
        var done =dilog2(this,R.layout.done_make_account)
        var Gender:String?="null"
        var int =Intent()
        var Place:String?= "null"
        var dilog_add_sub=dilog2(this,R.layout.add_sub)
        var dialogWait=dilog2(this,R.layout.load3)
        confirmationPassword

        var array=ArrayList<String>()

        setContentView(R.layout.new_account)

        var myData= new_user_data("mohameed","hmmod","12345678",
            "msater.hmmod@hotmail.com","male","khartoum","0903557942",array)


///subject//////////////////////////////////////////////////////////////////////////

        addSup.setOnClickListener {
            dilog_add_sub.startDialog()
            dilog_add_sub.inf.button_add.setOnClickListener {
                if(dilog_add_sub.inf.editText.text.toString()!="")
                {

               array.add( dilog_add_sub.inf.editText.text.toString())
                nameOfSup.text=dilog_add_sub.inf.editText.text.toString()
                    deleteSup.animate().alpha(1f).startDelay=0
                    nameOfSup.animate().alpha(1f).startDelay=0
                    addSup.animate().alpha(0f).startDelay=0
                    dilog_add_sub.dissDialog()
                    dilog_add_sub.inf.editText.setText("")
                }else{
                    dilog_add_sub.dissDialog()
                }

            }
            dilog_add_sub.inf.cancel_btn.setOnClickListener {
                dilog_add_sub.dissDialog()
            }



        }
        deleteSup.setOnClickListener {
            array.remove(nameOfSup.text)
            addSup.animate().alpha(1f).startDelay=0
            deleteSup.animate().alpha(0f).startDelay=0
            nameOfSup.animate().alpha(0f).startDelay=0
        }

        addSup1.setOnClickListener {
            dilog_add_sub.startDialog()
            dilog_add_sub.inf.button_add.setOnClickListener {
                if(dilog_add_sub.inf.editText.text.toString()!="")
                {
                    array.add( dilog_add_sub.inf.editText.text.toString())
                    nameOfSup1.text=dilog_add_sub.inf.editText.text.toString()
                    deleteSup1.animate().alpha(1f).startDelay=0
                    nameOfSup1.animate().alpha(1f).startDelay=0
                    addSup1.animate().alpha(0f).startDelay=0
                    dilog_add_sub.dissDialog()
                    dilog_add_sub.inf.editText.setText("")

                }else{
                    dilog_add_sub.dissDialog()
                }

            }
            dilog_add_sub.inf.cancel_btn.setOnClickListener {
                dilog_add_sub.dissDialog()
            }
        }
        deleteSup1.setOnClickListener {
            array.remove(nameOfSup1.text)
            addSup1.animate().alpha(1f).startDelay=0
            deleteSup1.animate().alpha(0f).startDelay=0
            nameOfSup1.animate().alpha(0f).startDelay=0
        }


        addSup2.setOnClickListener {
            dilog_add_sub.startDialog()
            dilog_add_sub.inf.button_add.setOnClickListener {
                if(dilog_add_sub.inf.editText.text.toString()!="")
                {
                    array.add( dilog_add_sub.inf.editText.text.toString())
                    nameOfSup2.text=dilog_add_sub.inf.editText.text.toString()
                    deleteSup2.animate().alpha(1f).startDelay=0
                    nameOfSup2.animate().alpha(1f).startDelay=0
                    addSup2.animate().alpha(0f).startDelay=0
                    dilog_add_sub.dissDialog()
                    dilog_add_sub.inf.editText.setText("")

                }else{
                    dilog_add_sub.dissDialog()
                }

            }
            dilog_add_sub.inf.cancel_btn.setOnClickListener {
                dilog_add_sub.dissDialog()
            }
        }
        deleteSup2.setOnClickListener {
            array.remove(nameOfSup2.text)
            addSup2.animate().alpha(1f).startDelay=0
            deleteSup2.animate().alpha(0f).startDelay=0
            nameOfSup2.animate().alpha(0f).startDelay=0
        }

        addSup3.setOnClickListener {

            dilog_add_sub.startDialog()
            dilog_add_sub.inf.button_add.setOnClickListener {
                if(dilog_add_sub.inf.editText.text.toString()!="")
                {
                    array.add( dilog_add_sub.inf.editText.text.toString())
                    nameOfSup3.text=dilog_add_sub.inf.editText.text.toString()
                    deleteSup3.animate().alpha(1f).startDelay=0
                    nameOfSup3.animate().alpha(1f).startDelay=0
                    addSup3.animate().alpha(0f).startDelay=0
                    dilog_add_sub.dissDialog()
                    dilog_add_sub.inf.editText.setText("")
                }
                else{
                    dilog_add_sub.dissDialog()
                }

            }
            dilog_add_sub.inf.cancel_btn.setOnClickListener {
                dilog_add_sub.dissDialog()
            }
        }
        deleteSup3.setOnClickListener {
            array.remove(nameOfSup3.text)
            addSup3.animate().alpha(1f).startDelay=0
            deleteSup3.animate().alpha(0f).startDelay=0
            nameOfSup3.animate().alpha(0f).startDelay=0
        }

///subject//////////////////////////////////////////////////////////////////////////


        create_Account_Btn.setOnClickListener {

           if ((
                       array.isNotEmpty()&&
                       phoneNumpper_new.text.toString()!=""&&
                       email_new.text.toString()!=""&&
                       realName_new.text.toString()!=""&&
                       userName_new.text.toString()!=""&&
                       confirmationPassword.text.toString()!=""&&
                       password_new.text.toString()!="")
                                     &&
                   (male_new.isChecked||famale_new.isChecked)
                                      &&
               (khartoum.isChecked||omdurman.isChecked||bahry.isChecked)
           ){
               if(testText(confirmationPassword.text.toString(),password_new.text.toString())) {
                   try {
                       myData = new_user_data(
                           realName_new.text.toString(),
                           userName_new.text.toString()
                           , password_new.text.toString(),
                           email_new.text.toString(),
                           Gender!!,
                           Place!!,
                           phoneNumpper_new.text.toString()
                           , array
                       )

                       int.putExtra( "real_Name",realName_new.text.toString())
                       int.putExtra( "user_Name", userName_new.text.toString())
                       int.putExtra( "Password",password_new.text.toString())
                       int.putExtra( " Email", email_new.text.toString())
                       int.putExtra( "Gender",Gender)
                       int.putExtra( "Place", Place)
                       int.putExtra( "PhoneNumpper",phoneNumpper_new.text.toString())
                       int.putExtra( " subject",array)

                       dialogWait.startDialog()
                       var hr =Handler()
                       hr.postDelayed({
                           dialogWait.dissDialog()
                           done.startDialog()
                           hr.postDelayed({
                               done.dissDialog()
                               startActivity(int)
                               setResult(Activity.RESULT_OK,int)
                               finish()
                           },3000)

                       },4000)




                   } catch (e: Exception) {
                       println(e.toString())
                   }
               }
               else{
                   wrongPass.startDialog()

                   var hr =Handler()
                   hr.postDelayed({
                       wrongPass.dissDialog()
                   },1500)
               }

           }
           else{
               fillOut.startDialog()
               var hr =Handler()
               hr.postDelayed({

                   fillOut.dissDialog()
               },1500)
           }

        }



        /////choise Gender/////////////

        famale_new.setOnClickListener {
            male_new.isChecked=false
            Gender="male"
        }
        male_new.setOnClickListener {
            famale_new.isChecked=false
            Gender="famale"
        }
        /////choise Gender/////////////

        /////choise Place////////////
        bahry.setOnClickListener {
            khartoum.isChecked=false
            omdurman.isChecked=false
            Place="bahry"
        }
        khartoum.setOnClickListener {
            bahry.isChecked=false
            omdurman.isChecked=false
            Place="khartoum"
        }
        omdurman.setOnClickListener {
            bahry.isChecked=false
            khartoum.isChecked=false
            Place="omdurman"
        }
        /////choise Place////////////
        super.onResume()
    }

    private fun testText(str:String, str1: String):Boolean
    {
        return str==str1
    }

}
