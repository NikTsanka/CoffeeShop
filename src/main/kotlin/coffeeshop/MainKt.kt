package coffeeshop

import java.lang.System.`in`
import java.util.*

fun main() {
    val coffeeMachine = CoffeeMachine(Scanner(`in`))
    coffeeMachine.request()
}
