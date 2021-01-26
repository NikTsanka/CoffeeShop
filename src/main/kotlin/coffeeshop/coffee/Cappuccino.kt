package coffeeshop.coffee

class Cappuccino(
    sugarQuantity: Int,
    private val milkQuantity: Int,
    private val withCinnamon: Boolean
) : Coffee(sugarQuantity) {

    private fun cinnamonPrice() = if (withCinnamon) 0.15 else 0.0
    private fun priceCalculation() = cappuccinoBasePrice + (sugarPrice * sugarQuantity) +
            (milkPrice * milkQuantity) + cinnamonPrice()

    override fun drink() {
        val price = String.format("%.2f", priceCalculation())
        val hasCinnamon = if (withCinnamon) "and with Cinnamon." else ""
        println()
        println(
            """                           --Order details--                
            Cappuccino Price:   $cappuccinoBasePrice$    
            Sugar Price:       $sugarPrice$
            Milk price:        $milkPrice$
            Cinnamon Price:    ${cinnamonPrice()}$            
            Cappuccino with:  $sugarQuantity Sugar, $milkQuantity Milk $hasCinnamon             
                                                Total fee: $price$
        """
        )
    }
}