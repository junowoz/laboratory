class Calculator(val name: String) {

    init {
        println("$name is the owner of this calculator.")
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun substract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Any {

        if (num2 != 0) {
            return num1 / num2
        } else {
            return "Error"
        }
    }

    fun power(num1: Int, num2: Int): Int {
        var result = 1
        for (i in 1..num2){
            result *= num2
        }

        return result
    }
}



fun main(){

    var calc = Calculator("Juno")
    println(calc.add(1,4))
    println(calc.substract(1,4))
    println(calc.multiply(1,4))
    println(calc.divide(1,4))
    println(calc.power(1,4))
}