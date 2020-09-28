package com.example.ashrahlei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.search.*

class search : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)
          var searchDialog=dilog2(this,R.layout.load3)
          var nameOfSup:String?=""
          var favGen:String?=""
          var favPla:String?=""



        var itnNotfound=Intent(this,not_found::class.java)

        search_btn.setOnClickListener {
            searchDialog.startDialog()
            nameOfSup=search_edit_text.text.toString()
              var myInfo= infoSearch(nameOfSup!!,favGen!!,favPla!!)
            var hr =Handler()
            hr.postDelayed({
                searchDialog.dissDialog()
                startActivity(itnNotfound)
                finish()
            },4000)

        }

        notImportnet.setOnClickListener {
            male.isChecked=false
            famale.isChecked=false
            favGen="not_Importent"
        }

        male.setOnClickListener {
            famale.isChecked=false
            notImportnet.isChecked=false
            favGen="male"
        }
        famale.setOnClickListener {
            notImportnet.isChecked=false
            male.isChecked=false
            favGen="famel"
        }

        bahry.setOnClickListener {

            khartoum.isChecked=false
            omdurman.isChecked=false
            favPla="bahry"
        }
        khartoum.setOnClickListener {
            bahry.isChecked=false
            omdurman.isChecked=false
            favPla="khartoum"
        }
        omdurman.setOnClickListener {
            bahry.isChecked=false
            khartoum.isChecked=false
            favPla="omdurman"

        }

    }
}
