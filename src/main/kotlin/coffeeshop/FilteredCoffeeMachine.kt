package coffeeshop

import coffeeshop.coffee.Coffee
import coffeeshop.coffee.FilteredCoffee

class FilteredCoffeeMachine : CoffeeMachine() {

    override fun request(): Coffee {
        println("--=== Filtered Coffee Machine ===--")
        return FilteredCoffee(requestCoffeeStrength(), requestSugar())
    }

    private fun requestCoffeeStrength(): Int {
        println("Choose coffee strength from  1.(Not strong) to 5.(Very strong) ")
        val answer = scanner.nextInt()
        if (answer in 1..5) {
            return answer
        }
        println("Coffee strength should be from 1 to 5! ")
        return requestCoffeeStrength()
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
}