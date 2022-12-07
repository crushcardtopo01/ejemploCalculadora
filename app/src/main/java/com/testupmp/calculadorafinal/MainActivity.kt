package com.testupmp.calculadorafinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSumar = findViewById<Button>(R.id.btnSuma)
        val btnResta = findViewById<Button>(R.id.btnResta)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplpicar)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnPow = findViewById<Button>(R.id.btnPow)
        val btnSqrt = findViewById<Button>(R.id.btnSqrt)

        val num1= findViewById<EditText>(R.id.n1)
        val num2= findViewById<EditText>(R.id.n2)

        val total = findViewById<TextView>(R.id.result)
        try {
            btnSumar.setOnClickListener {
                val result = num1.text.toString().toInt()+num2.text.toString().toInt()
                total.text=result.toString()
            }
            btnResta.setOnClickListener {
                val result = num1.text.toString().toInt()-num2.text.toString().toInt()
                total.text=result.toString()
            }
            btnMultiplicar.setOnClickListener {
                val result = num1.text.toString().toInt()*num2.text.toString().toInt()
                total.text=result.toString()
            }
            btnDividir.setOnClickListener {
                val result = num1.text.toString().toInt()/num2.text.toString().toInt()
                total.text=result.toString()
            }
            btnPow.setOnClickListener {
                val aux = num1.toString().toFloat().pow(num2.text.toString().toInt())
                total.text=aux.toString()

            }
            btnSqrt.setOnClickListener {

                val aux = num1.toString().toFloat()
                val result = sqrt(aux)
                total.text=result.toString()

            }
        }catch (e:Exception){
            Toast.makeText(
                this@MainActivity,
                "something is wrong "+e.toString(), Toast.LENGTH_SHORT
            ).show()
        }

    }
}