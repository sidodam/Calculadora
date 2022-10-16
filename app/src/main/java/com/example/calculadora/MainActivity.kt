package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnOperation = findViewById(R.id.operation) as TextView
        val btnResult = findViewById(R.id.result) as TextView
        val btnClear = findViewById(R.id.clearAll) as Button
        val btnEqual =  findViewById(R.id.equalSign) as Button
        val btnBack =  findViewById(R.id.clearOnce) as Button
        val btnAdd =  findViewById(R.id.addSign) as Button
        val btnSubtract=  findViewById(R.id.subtractSign) as Button
        val btnMult = findViewById(R.id.multSign) as Button
        val btnDivide = findViewById(R.id.divideSign) as Button
        val btnModule = findViewById(R.id.modulesign) as Button
        val btnZero = findViewById(R.id.zero) as Button
        val btnOne = findViewById(R.id.one) as Button
        val btnTwo = findViewById(R.id.two) as Button
        val btnThree = findViewById(R.id.three) as Button
        val btnFour = findViewById(R.id.four) as Button
        val btnFive = findViewById(R.id.five) as Button
        val btnSix = findViewById(R.id.six) as Button
        val btnSeven = findViewById(R.id.seven) as Button
        val btnEight = findViewById(R.id.eight) as Button
        val btnNine = findViewById(R.id.nine) as Button
        val btnPoint = findViewById(R.id.point) as Button




        btnAdd.setOnClickListener {

            btnOperation.append("+")
            btnAdd.isEnabled = false
            btnSubtract.isEnabled = false
            btnMult.isEnabled = false
            btnModule.isEnabled = false
            btnDivide.isEnabled = false

        }

        btnSubtract.setOnClickListener {

            btnOperation.append("-")
            btnSubtract.isEnabled = false
            btnAdd.isEnabled = false
            btnMult.isEnabled = false
            btnModule.isEnabled = false
            btnDivide.isEnabled = false

        }

        btnMult.setOnClickListener {

            btnOperation.append("*")

            btnMult.isEnabled = false
            btnAdd.isEnabled = false
            btnSubtract.isEnabled = false
            btnModule.isEnabled = false
            btnDivide.isEnabled = false


        }


        btnModule.setOnClickListener {

            btnOperation.append("%")

            btnModule.isEnabled = false
            btnAdd.isEnabled = false
            btnSubtract.isEnabled = false
            btnMult.isEnabled = false
            btnDivide.isEnabled = false

        }


        btnClear.setOnClickListener {

            btnOperation.setText("")
            btnResult.setText("")


            btnAdd.isEnabled = true
            btnSubtract.isEnabled = true
            btnMult.isEnabled = true
            btnDivide.isEnabled = true
            btnModule.isEnabled = true

        }


        btnBack.setOnClickListener {
            val newString = btnOperation.text.dropLast(1)
            btnOperation.setText(newString)
        }



        btnZero.setOnClickListener {

            btnOperation.append("0")

        }


        btnOne.setOnClickListener {

            btnOperation.append("1")

        }

        btnTwo.setOnClickListener {

            btnOperation.append("2")

        }
        btnThree.setOnClickListener {

            btnOperation.append("3")

        }

        btnFour.setOnClickListener {

            btnOperation.append("4")

        }

        btnFive.setOnClickListener {

            btnOperation.append("5")

        }
        btnSix.setOnClickListener {

            btnOperation.append("6")

        }
        btnSeven.setOnClickListener {

            btnOperation.append("7")


        }
        btnEight.setOnClickListener {

            btnOperation.append("8")

        }

        btnNine.setOnClickListener {

            btnOperation.append("9")

        }
        btnPoint.setOnClickListener {

            btnOperation.append(".")

        }

        btnDivide.setOnClickListener {

            btnOperation.append("/")

        }






        btnEqual.setOnClickListener {

           var operationText =  btnOperation.text


         //   if (it.equals('+') || it.equals('=') || it.equals('/') || it.equals('*')  || it.equals('%')  )

            var operation =  operationText.find { !it.isDigit() && !it.equals('.') }

            var s  = operationText.split(operation!!) //!! non nullable , its there bro trust me

            var num1 = s[0].toDouble()
            var num2 = s[1].toDouble()

            var calculadora = Calc(num1 , num2)

            if ( operation.equals('+'))
            {
                btnResult.text = calculadora.addNumbers().toString()
            }
            else if ( operation.equals('-'))

            {
                btnResult.text = calculadora.subtractNumbers().toString()
            }

            else if ( operation.equals('*'))

            {
                btnResult.text = calculadora.multNumbers().toString()
            }

            else if ( operation.equals('/'))

            {
                btnResult.text = calculadora.divideNumbers().toString()
            }

            else if ( operation.equals('%'))

            {
                btnResult.text = calculadora.moduleNumbers().toString()
            }

        }




        fun numberAdding(view: View) {
            Toast.makeText(this@MainActivity, "asdasd", Toast.LENGTH_SHORT).show()
        }


    }
}




