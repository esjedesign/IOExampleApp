package app

import utils.CalcUtils

class App {
    fun run(){
        printHeader()
        inputValue()

    }
    private fun printHeader(){
        println("==================")
        println("Simple Calc App!")
        println("==================")
        }
    private fun inputValue(){
        println("Enter Value for A : ")
        val a = readLine()?.toInt() ?: 0
        println("Enter Value for B : ")
        val b = readLine()?.toInt() ?: 0
        calculate(a,b)
        }

    private  fun calculate(a : Int, b : Int) {
        val  calcUtils = CalcUtils()
        println("Result for Plus = ${calcUtils.plus(a,b)}")
        println("Result for Minus = ${calcUtils.minus(a,b)}")
        println("Result for Times = ${calcUtils.times(a,b)}")
        println("Result for Devided = ${calcUtils.devided(a,b)}")

    }
    companion object {
        @JvmStatic
        fun main (Args : Array<String>) {
            val app = App()
            app.run()

        }
    }
}