package coffeeshop.coffee

abstract class Coffee(val sugarQuantity: Int) {

  abstract fun drink()

    companion object {
        const val filteredCoffeeLevelPrice = 0.3
        const val filteredCoffeeBasePrice = 1.0
        const val cappuccinoBasePrice = 3.50
        const val latteBasePrice = 4.50
        const val sugarPrice = 0.25
        const val milkPrice = 0.75
    }
}