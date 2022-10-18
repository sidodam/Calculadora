package com.example.calculadora

class Calc(firstNum: Double, secondNum: Double) {
    val num1 = firstNum
    var num2 =  secondNum


    fun addNumbers(): Double {


        val sum = num1 + num2
        val sumInteger = sum
        return sumInteger
    }

    fun subtractNumbers(): Double {
        val sum = num1 - num2
        val sumInteger = sum
        return sumInteger
    }


    fun divideNumbers(): Double {
        val sum = num1 / num2
        val sumInteger = sum
        return sumInteger
    }


    fun multNumbers(): Double {
        val sum = num1 * num2
        val sumInteger = sum
        return sumInteger
    }


    fun moduleNumbers(): Int {
        val sum = num1 % num2
        val sumInteger = sum.toInt()
        return sumInteger
    }

}