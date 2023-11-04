package com.example.teploff_zp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.text.toInt
import kotlin.text.toInt as kotlinTextToInt


class MainActivity : AppCompatActivity() {
    var counter : Boolean = false;
    internal lateinit var btnSwitch: Switch;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextNumber : EditText? = findViewById<EditText>(R.id.editTextNumber);
        var editTextNumber2 : EditText? = findViewById<EditText>(R.id.editTextNumber2);
        var button : Button = findViewById<Button>(R.id.button);

        var editTextNumber3  = findViewById<EditText>(R.id.sumozon);
        var ozon2 : Int = 0;
        btnSwitch = findViewById<View>(R.id.switch2) as Switch;
        btnSwitch.setOnClickListener {
            if (btnSwitch.isChecked){
                editTextNumber3.visibility = View.VISIBLE
                }
            else {
                editTextNumber3.visibility = View.INVISIBLE

                }
        }
        //var switch = findViewById<Switch>(R.id.switch2);
        //switch.setOnCheckedChangeListener(View.VISIBLE);
    }



    fun onClick(view: View) {
        var switch = findViewById<Switch>(R.id.switch2);
        var editTextNumber3  = findViewById<EditText>(R.id.sumozon);
        val editTextNumber  = findViewById<EditText>(R.id.editTextNumber);
        val editTextNumber2  = findViewById<EditText>(R.id.editTextNumber2);
        var ozon : Int;
        var ozon2 : Int;
        var dini : Int;
        var dini2 : Int;
        val itog : Int;
        val textView4 = findViewById<TextView>(R.id.textView4);
        var itog2 : Int = editTextNumber2.text.toString().kotlinTextToInt();
        if (btnSwitch.isChecked){
            ozon = editTextNumber3.text.toString().kotlinTextToInt();
            ozon2 = ozon / 100;
            dini = editTextNumber.text.toString().kotlinTextToInt();
            dini2 = dini * 700;
            itog = dini2 + (itog2 / 100 * 3) + ozon2 - 2600;
        }
        else
        {
            dini = editTextNumber.text.toString().kotlinTextToInt();
            dini2 = dini * 700;
            itog = dini2 + (itog2 / 100 * 3) - 2600;
        }
        textView4.text = "Ты заработал немножко денежек!: " + itog + " рубликов";
    }

}