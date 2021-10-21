package com.example.changebackground

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Layout = findViewById<ConstraintLayout>(R.id.Clayout)
        val etDN = findViewById<EditText>(R.id.etDN)
        val bChange = findViewById<Button>(R.id.bChange)
        val tvDN = findViewById<TextView>(R.id.tv1)

        bChange.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var dayOrNightStr = etDN.text?.toString()
                when(dayOrNightStr?.toLowerCase()){

                    "day"->{val time = DayorNight()
                        time.changeBackground(Layout,DayorNight.day)


                    }
                    "night"->{val time = DayorNight()
                        time.changeBackground(Layout,DayorNight.night)
                    }
                }
            }

        })





    }
}


