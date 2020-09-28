package com.example.ashrahlei

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.user_main.*

class user_main : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener{




    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_main)

        ////////reciclerViewCode///////////////////
        var mySup =ArrayList<String>()
        mySup.add("")
        mySup.add("")
        mySup.add("")
        mySup.add("")
        mySup.set(0,"java")
        mySup.set(1,"ITCS")


       var cardUs=ArrayList<user_show>()

        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))
        cardUs.add(user_show("mohameed albdrie", "kahrtoum", R.drawable.hm, "electornic", mySup))

        rec.layoutManager=LinearLayoutManager(this, LinearLayout.VERTICAL,false)
         rec.adapter=adb(cardUs)
        ////////reciclerViewCode///////////////////
        navi.setNavigationItemSelectedListener(this)
        var intsearch=Intent(this,search::class.java)
       setSupportActionBar(tool)
        var actTog = ActionBarDrawerToggle(this, mdrawer, tool, R.string.open, R.string.close)

        mdrawer.addDrawerListener(actTog)
        actTog.syncState()

        go_to_serach.setOnClickListener {
            startActivity(intsearch)
        }

    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var item = item.itemId
        var intedit = Intent(this, new_account::class.java)
        when(item){
            R.id.edit_accoont->intedit = Intent(this, edit_account::class.java)
            R.id.contactUs->intedit = Intent(this, contact_us::class.java)
        }
        startActivity(intedit)
        closeDrw()


return true

    }

    @SuppressLint("WrongConstant")
    private fun closeDrw() {
        mdrawer.closeDrawer(Gravity.START)
    }

    @SuppressLint("WrongConstant")
    override fun onBackPressed() {
        if(mdrawer.isDrawerOpen(GravityCompat.START)){
            closeDrw()
        }else{
        super.onBackPressed()}
    }
}
