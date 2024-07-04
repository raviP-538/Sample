package com.technobrave.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var editText:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText?.findViewById<EditText>(R.id.editText)

        //Add in Sample1 Project

       editText?.setOnClickListener {
           Toast.makeText(this,"Click",Toast.LENGTH_LONG).show()
       }


    }
}