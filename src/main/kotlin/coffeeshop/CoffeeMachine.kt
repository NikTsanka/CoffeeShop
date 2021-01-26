package coffeeshop

import coffeeshop.coffee.Coffee
import java.util.*

abstract class CoffeeMachine(
    val scanner: Scanner = Scanner(System.`in`)
) {

    abstract fun request(): Coffee
}