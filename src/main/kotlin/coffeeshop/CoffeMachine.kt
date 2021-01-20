package coffeeshop

import java.util.*

class CoffeeMachine(
    private val scanner: Scanner
) {

    fun request() {
        println("Please Enter Coffee Type(Available Types: Latte, Cappuccino)")
        return when (scanner.next().toLowerCase()) {
            "latte" -> Latte(requestSugar(), requestMilk()).show()
            "cappuccino" -> Cappuccino(requestSugar(), requestMilk(), requestCinnamon()).show()
            else -> {
                error("unknown coffee type")
            }
        }
    }

    private fun requestCinnamon(): Boolean {
        print("Do you want cinnamon: Y/N ")
        val answer = scanner.next()
        if (answer.equals("Y", ignoreCase = true)) {
            return true
        } else if (answer.equals("N", ignoreCase = true)) {
            return false
        }
        error("Invalid input!")
    }

    private fun requestSugar(): Int {
        print("Please enter sugar quantity: ")
        return scanner.nextInt()
    }

    private fun requestMilk(): Int {
        print("Please enter Milk quantity: ")
        return scanner.nextInt()
    }
}