package coffeeshop

import coffeeshop.coffee.Cappuccino
import coffeeshop.coffee.Coffee
import coffeeshop.coffee.Latte

class EspressoCoffeeMachine : CoffeeMachine() {

    override fun request(): Coffee {
        println("--=== Espresso Coffee Machine ===--")
        println("Please Enter Coffee Type(Available Types: Latte, Cappuccino)")
        return when (scanner.next().toLowerCase()) {
            "latte" -> Latte(requestSugar(), requestMilk())
            "cappuccino" -> Cappuccino(requestSugar(), requestMilk(), requestCinnamon())
            else -> {
                println("Invalid input!")
                return request()
            }
        }
    }

    private fun requestCinnamon(): Boolean {
        print("Do you want cinnamon: Y/N ")
        val answer = scanner.next()
        if (answer.equals("Y", ignoreCase = true)) return true
        else if (answer.equals("N", ignoreCase = true)) return false
        println("Invalid input!")
        return requestCinnamon()
    }

    private fun requestSugar(): Int {
        print("Do you want sugar: Y/N ")
        val answer = scanner.next()
        if (answer.equals("Y", ignoreCase = true)) {
            print("Please enter sugar quantity: ")
            return scanner.nextInt()
        } else if (answer.equals("N", ignoreCase = true)) return 0
        println("Invalid input!")
        return requestSugar()
    }

    private fun requestMilk(): Int {
        print("Do you want milk: Y/N ")
        val answer = scanner.next()
        if (answer.equals("Y", ignoreCase = true)) {
            print("Please enter Milk quantity: ")
            return scanner.nextInt()
        } else if (answer.equals("N", ignoreCase = true)) return 0
        println("Invalid input!")
        return requestMilk()
    }
}