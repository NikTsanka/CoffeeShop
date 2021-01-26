package coffeeshop.coffee

class FilteredCoffee(
    private val coffeeStrengthQuantity: Int,
    sugarQuantity: Int
) : Coffee(sugarQuantity) {

    private fun priceCalculation() = filteredCoffeeBasePrice + (filteredCoffeeLevelPrice * coffeeStrengthQuantity) +
            (sugarQuantity * sugarPrice)

    override fun drink() {
        val price = String.format("%.2f", priceCalculation())
        println()
        println(
            """                          -- Order details --                
            Filtered Coffee: $filteredCoffeeBasePrice$    
            Level Price:     $filteredCoffeeLevelPrice$
            Sugar Price:     $sugarPrice$              
            Latte with:  $sugarQuantity Sugar, $coffeeStrengthQuantity Level quantity.         
                                       Total fee: $price$
        """
        )
    }
}