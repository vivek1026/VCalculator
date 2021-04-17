import java.math.RoundingMode
import java.text.DecimalFormat


fun main(args: Array<String>) {
    var cal =  Calculator()
    cal.getInputs()
    var result = cal.getResult()
    println("result =======> $result")
}



class Calculator {

    private var number1 = 0.0
    private var number2 = 0.0
    private var operator = "1"

    fun getInputs() {

        println("Enter number 1:")
        number1 = readLine()?.toDouble()!!
        println("Enter number 2:")
        number2 = readLine()?.toDouble()!!
        println("\nEnter 1 for + ( Add )")
        println("Enter 2 for - ( Subtract )")
        println("Enter 3 for * ( Multiply )")
        println("Enter 4 for / ( Divide )")
        println("Enter 5 for % ( Mode )")

        operator = readLine().toString()
    }

    fun getResult(): String {
        var df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.FLOOR
        when (operator) {
            "1" -> return (number1 + number2).toString()
            "2" -> return (number1 - number2).toString()
            "3" -> return (number1 * number2).toString()
            "4" -> return df.format(number1 / number2).toString()
            "5" -> return (number1 % number2).toString()
            else -> {
                return "Please enter valid number"
            }
        }
    }
}
