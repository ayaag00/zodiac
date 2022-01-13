package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context=this
        val name:EditText=findViewById(R.id.name)
        val month:EditText=findViewById(R.id.month)
        val day:EditText=findViewById(R.id.day)
        val showbtn:Button =findViewById(R.id.show)

        var db=Handler(context)

        val insert:Button=findViewById(R.id.insert)

        insert.setOnClickListener {
            var user= Database(name.text.toString(),day.text.toString(),month.text.toString())

            db.insertData(user)
            insert.isEnabled = false
            insert.isClickable = false
        }
        val deletebtn:Button=findViewById(R.id.delete)
        deletebtn.setOnClickListener {
            db.deleteData()
            insert.isEnabled = true
            insert.isClickable = true

        }
        val updatebtn:Button=findViewById(R.id.update)
        updatebtn.setOnClickListener {
            var user= Database(name.text.toString(),day.text.toString(),month.text.toString())
            db.updateData(user)
        }


           showbtn.setOnClickListener {
               if (month.text.toString() == "12") {
                   if (day.text.toString().toInt()in 22..31) {
                       var dialog_var = Capricorn()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "1") {
                   if (day.text.toString().toInt()in 1..19) {
                       var dialog_var = Capricorn()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "1") {
                   if (day.text.toString().toInt()in 20..31) {
                       var dialog_var = aquarius()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "2") {
                   if (day.text.toString().toInt()in 1..18) {
                       var dialog_var = aquarius()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "2") {
                   if (day.text.toString().toInt()in 19..28) {
                       var dialog_var = pisces()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "3") {
                   if (day.text.toString().toInt()in 1..20) {
                       var dialog_var = pisces()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "3") {
                   if (day.text.toString().toInt()in 21..31) {
                       var dialog_var = Aries()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "4") {
                   if (day.text.toString().toInt()in 1..19){
                       var dialog_var = Aries()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "4") {
                   if (day.text.toString().toInt()in 20..30)  {
                       var dialog_var = taurus()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "5") {
                   if (day.text.toString().toInt()in 1..20)  {
                       var dialog_var = taurus()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "5") {
                   if (day.text.toString().toInt()in 21..30)  {
                       var dialog_var = Gemini()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "6") {
                   if (day.text.toString().toInt()in 1..21) {
                       var dialog_var = Gemini()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "6") {
                   if (day.text.toString().toInt()in 22..30) {
                       var dialog_var = CustomDialogClass()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
                   if (month.text.toString() == "7") {
                       if (day.text.toString().toInt()in 1..22) {
                           var dialog_var = CustomDialogClass()
                           dialog_var.show(supportFragmentManager, "Custom Dialog")

                       }
                   }
               if (month.text.toString() == "7") {
                   if (day.text.toString().toInt()in 23..31) {
                       var dialog_var = leo()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "8") {
                   if (day.text.toString().toInt()in 1..22) {
                       var dialog_var = leo()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "8") {
                   if (day.text.toString().toInt()in 23..31) {
                       var dialog_var = virgo()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "9") {
                   if (day.text.toString().toInt()in 1..22) {
                       var dialog_var = virgo()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "9") {
                   if (day.text.toString().toInt()in 23..30) {
                       var dialog_var = libra()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "10") {
                   if (day.text.toString().toInt()in 1..22){
                       var dialog_var = libra()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }


               if (month.text.toString() == "10") {
                   if (day.text.toString().toInt()in 23..31) {
                       var dialog_var = scorpio()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "11") {
                   if (day.text.toString().toInt()in 1..22) {
                       var dialog_var = scorpio()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "11") {
                   if (day.text.toString().toInt()in 23..30) {
                       var dialog_var = Sagittarius()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }
               if (month.text.toString() == "12") {
                   if (day.text.toString().toInt()in 1..21) {
                       var dialog_var = Sagittarius()
                       dialog_var.show(supportFragmentManager, "Custom Dialog")

                   }
               }



           }
    /*val ratingtv:TextView=findViewById(R.id.TVrating)
        ratingtv.setOnClickListener {
            var dialog_var=CustomDialogClass()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }
    }
    fun receiveFeedback(feedback: String){
        val ratingTV : TextView = findViewById(R.id.TVrating)
        ratingTV.text = feedback;*/
    }
}