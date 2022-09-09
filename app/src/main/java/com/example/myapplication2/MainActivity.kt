package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var chkHead: CheckBox
    lateinit var chkEyes: CheckBox
    lateinit var chkEyebrows: CheckBox
    lateinit var chkGlasses: CheckBox
    lateinit var chkNose: CheckBox
    lateinit var chkMouth: CheckBox
    lateinit var chkMustache: CheckBox
    lateinit var chkEars: CheckBox
    lateinit var chkArms: CheckBox
    lateinit var chkShoes: CheckBox




    lateinit var picHead: ImageView
    lateinit var picEyes: ImageView
    lateinit var picEyebrows: ImageView
    lateinit var picGlasses: ImageView
    lateinit var picNose: ImageView
    lateinit var picMouth: ImageView
    lateinit var picMustache: ImageView
    lateinit var picEars: ImageView
    lateinit var picArms: ImageView
    lateinit var picShoes: ImageView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         chkHead = findViewById<CheckBox>(R.id.cHead)
         chkEyes = findViewById<CheckBox>(R.id.cEyes)
         chkEyebrows = findViewById<CheckBox>(R.id.cEyebrows)
         chkGlasses = findViewById<CheckBox>(R.id.cGlasses)
         chkNose = findViewById<CheckBox>(R.id.cNose)
         chkMouth = findViewById<CheckBox>(R.id.cMouth)
         chkMustache = findViewById<CheckBox>(R.id.cMustache)
         chkEars = findViewById<CheckBox>(R.id.cEars)
         chkArms = findViewById<CheckBox>(R.id.cArms)
         chkShoes = findViewById<CheckBox>(R.id.cShoes)



        picHead = findViewById<ImageView>(R.id.pHead)
        picHead.visibility = View.INVISIBLE

        picEyes = findViewById<ImageView>(R.id.pEyes)
        picEyes.visibility = View.INVISIBLE

        picEyebrows = findViewById<ImageView>(R.id.pEyebrows)
        picEyebrows.visibility = View.INVISIBLE

        picGlasses = findViewById<ImageView>(R.id.pGlasses)
        picGlasses.visibility = View.INVISIBLE

        picNose = findViewById<ImageView>(R.id.pNose)
        picNose.visibility = View.INVISIBLE

        picMouth = findViewById<ImageView>(R.id.pMouth)
        picMouth.visibility = View.INVISIBLE

        picMustache = findViewById<ImageView>(R.id.pMustache)
        picMustache.visibility = View.INVISIBLE

        picEars = findViewById<ImageView>(R.id.pEars)
        picEars.visibility = View.INVISIBLE

        picArms = findViewById<ImageView>(R.id.pArms)
        picArms.visibility = View.INVISIBLE

        picShoes = findViewById<ImageView>(R.id.pShoes)
        picShoes.visibility = View.INVISIBLE


    }



   public fun toggleItem(v: View){

        if(chkHead.isChecked){
            picHead.visibility = View.VISIBLE;
        }

       if(chkHead.isChecked==false){
           picHead.visibility = View.INVISIBLE;
       }


       if(chkEyes.isChecked){
           picEyes.visibility = View.VISIBLE;
       }

       if(chkEyes.isChecked==false){
           picEyes.visibility = View.INVISIBLE;
       }

       if(chkEars.isChecked){
           picEars.visibility = View.VISIBLE;
       }


       if(chkEars.isChecked==false){
           picEars.visibility = View.INVISIBLE;
       }

       if(chkEyebrows.isChecked){
           picEyebrows.visibility = View.VISIBLE;
       }


       if(chkEyebrows.isChecked==false){
           picEyebrows.visibility = View.INVISIBLE;
       }


       if(chkGlasses.isChecked){
           picGlasses.visibility = View.VISIBLE;
       }


       if(chkGlasses.isChecked==false){
           picGlasses.visibility = View.INVISIBLE;
       }


       if(chkNose.isChecked){
           picNose.visibility = View.VISIBLE;
       }


       if(chkNose.isChecked==false){
           picNose.visibility = View.INVISIBLE;
       }


       if(chkMustache.isChecked){
           picMustache.visibility = View.VISIBLE;
       }


       if(chkMustache.isChecked==false){
           picMustache.visibility = View.INVISIBLE;
       }


       if(chkMouth.isChecked){
           picMouth.visibility = View.VISIBLE;
       }


       if(chkMouth.isChecked==false){
           picMouth.visibility = View.INVISIBLE;
       }


       if(chkArms.isChecked){
           picArms.visibility = View.VISIBLE;
       }


       if(chkArms.isChecked==false){
           picArms.visibility = View.INVISIBLE;
       }


       if(chkShoes.isChecked){
           picShoes.visibility = View.VISIBLE;
       }


       if(chkShoes.isChecked==false){
           picShoes.visibility = View.INVISIBLE;
       }






    }


}