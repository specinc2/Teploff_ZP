package com.example.teploff_zp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.text.toInt as kotlinTextToInt


class MainActivity : AppCompatActivity() {
var counter : Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextNumber : EditText? = findViewById<EditText>(R.id.editTextNumber);
        var editTextNumber2 : EditText? = findViewById<EditText>(R.id.editTextNumber2);
        var editTextNumber3 : EditText? = findViewById<EditText>(R.id.sumozon);
        var button : Button = findViewById<Button>(R.id.button);
        //var switch = findViewById<Switch>(R.id.switch2);
        //switch.setOnCheckedChangeListener(View.VISIBLE);



    }

    fun onClick(view: View) {
        var switch = findViewById<Switch>(R.id.switch2);
        var editTextNumber3  = findViewById<EditText>(R.id.sumozon);
        if (switch.isChecked)
            editTextNumber3.visibility = if (editTextNumber3.visibility == View.INVISIBLE){
                View.VISIBLE
            }
            else {
                View.INVISIBLE
            }
        val editTextNumber  = findViewById<EditText>(R.id.editTextNumber);
        val editTextNumber2  = findViewById<EditText>(R.id.editTextNumber2);

        val textView4 = findViewById<TextView>(R.id.textView4);
        var itog2 : Int = editTextNumber2.text.toString().kotlinTextToInt();
        var ozon : Int = editTextNumber3.text.toString().kotlinTextToInt();
        var ozon2 : Int = ozon / 100;
        var dini : Int = editTextNumber.text.toString().kotlinTextToInt();
        var dini2 : Int = dini * 700;
        val itog : Int = dini2 + (itog2 / 100 * 3) + ozon2 - 2600;
        textView4.text = "Ты заработал немножко денежек!: " + itog + " рубликов";
    }

}