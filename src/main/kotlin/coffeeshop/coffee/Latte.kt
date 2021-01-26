package coffeeshop.coffee

class Latte(
    sugarQuantity: Int,
    private val milkQuantity: Int
) : Coffee(sugarQuantity) {

    private fun priceCalculation() = latteBasePrice + (sugarPrice * sugarQuantity) + (milkPrice * milkQuantity)

    override fun drink() {
        val price = String.format("%.2f", priceCalculation())
        println()
        println(
            """                          -- Order details --                
            Latte Price:       $latteBasePrice$    
            Sugar Price:       $sugarPrice$
            Milk price:        $milkPrice$              
            Latte with:  $sugarQuantity Sugar, $milkQuantity Milk.             
                                       Total fee: $price$
        """
        )
    }
}