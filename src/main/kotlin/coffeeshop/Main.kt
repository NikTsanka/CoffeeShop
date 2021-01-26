package coffeeshop

import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)

    println(
        """Hello user please choose Coffee Machine
 Choose Number :   1 | Espresso Coffee Machine
                   2 | Filtered Coffee Machine """
    )

    return when (scanner.nextInt()) {
        1 -> {
            val espressoCoffeeMachine = EspressoCoffeeMachine()
            val espresso = espressoCoffeeMachine.request()
            espresso.drink()
        }
        2 -> {
            val filteredCoffeeMachine = FilteredCoffeeMachine()
            val filterCoffee = filteredCoffeeMachine.request()
            filterCoffee.drink()
        }
        else -> error("Invalid input!")
    }


}

