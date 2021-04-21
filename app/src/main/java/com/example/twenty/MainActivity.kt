package com.example.twenty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = LinearLayout(this)

        val button1 = Button(this)
        button1.text = "Button1"
        linearLayout.addView(button1)

        val button2 = Button(this)
        button2.text = "Button2"
        linearLayout.addView(button2)

        setContentView(linearLayout)


    }
}