package com.example.typesofbuttonsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var b1 = findViewById<Button>(R.id.button)
        b1.setOnClickListener {
            Toast.makeText(applicationContext,"Button is Clicked",Toast.LENGTH_LONG).show()
        }

        var ib = findViewById<ImageButton>(R.id.imageButton)
        ib.setOnClickListener {
            Toast.makeText(applicationContext,"AU Logo is Clicked",Toast.LENGTH_LONG).show()
        }

        var tb = findViewById<ToggleButton>(R.id.toggleButton)
        var iv = findViewById<ImageView>(R.id.imageView)
        tb.setOnClickListener {
            if(tb.text.toString().equals("ON")){
                iv.setImageResource(R.drawable.bulb_on)
            }else{
                iv.setImageResource(R.drawable.bulb_off)
            }
        }


        var sv = findViewById<Switch>(R.id.switch1)
        sv.text = "Bulb off"
        sv.setOnClickListener {
            if(sv.text.toString().contentEquals("Bulb Off",true)){
                sv.text = "Bulb On"
                iv.setImageResource(R.drawable.bulb_on)
            }else{
                sv.text = "Bulb off"
                iv.setImageResource(R.drawable.bulb_off)
            }
        }

        var fb = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fb.setOnClickListener {
            Toast.makeText(applicationContext,"Sanitizer button Clicked",Toast.LENGTH_LONG).show()
        }

        var cb1 = findViewById<CheckBox>(R.id.checkBox)
        var cb2 = findViewById<CheckBox>(R.id.checkBox2)
        var cb3 = findViewById<CheckBox>(R.id.checkBox3)
        var tv = findViewById<TextView>(R.id.textView)

        cb1.setOnClickListener {
            var str = "CPP is = ${cb1.isChecked}\nJava is = ${cb2.isChecked}\nKotlin is = ${cb3.isChecked}"
            tv.setText(str)
        }
        cb2.setOnClickListener {
            var str = "CPP is = ${cb1.isChecked}\nJava is = ${cb2.isChecked}\nKotlin is = ${cb3.isChecked}"
            tv.setText(str)
        }
        cb3.setOnClickListener {
            var str = "CPP is = ${cb1.isChecked}\nJava is = ${cb2.isChecked}\nKotlin is = ${cb3.isChecked}"
            tv.setText(str)
        }


        var tv2 = findViewById<TextView>(R.id.textView2)
        var rg = findViewById<RadioGroup>(R.id.radioGroup)

        rg.setOnCheckedChangeListener { radioGroup, i ->
            var rb = findViewById<RadioButton>(i)
            if(rb!=null)
                tv2.setText(rb.text)
        }
        var b2 = findViewById<Button>(R.id.button2)
        b2.setOnClickListener {
            rg.clearCheck()
            tv2.setText("Choose an Option")
        }

    }
}
















