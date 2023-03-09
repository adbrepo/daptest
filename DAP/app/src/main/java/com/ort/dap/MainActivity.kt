package com.ort.dap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var label :TextView
    lateinit var btnShow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label = findViewById(R.id.txtLabel)
        btnShow = findViewById(R.id.btnShow)

        label.text = ""

      btnShow.setOnClickListener {
          label.text = "Hace menos calor"
      }
    }
}