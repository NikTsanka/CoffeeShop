package coffeeshop

class Cappuccino(
    private val sugarPrice: Double,
    private val sugarQuantity: Int,
    private val milkPrice: Double,
    private val milkQuantity: Int,
    private val withCinnamon: Boolean
) {

    constructor(
        sugarQuantity: Int,
        milkQuantity: Int,
        withCinnamon: Boolean
    ) : this(
        sugarPrice = 0.3,
        milkPrice = 0.7,
        sugarQuantity = sugarQuantity,
        milkQuantity = milkQuantity,
        withCinnamon = withCinnamon
    )

    private fun cinnamonPrice() = if (withCinnamon) 0.15 else 0.0

    private fun price() = basePrice + (sugarPrice * sugarQuantity) + (milkPrice * milkQuantity) + cinnamonPrice()

    fun show() {
        val price = String.format("%.2f", price())
        val hasCinnamon = if (withCinnamon) "With Cinnamon." else ""
        println()
        println(
            """                              --Order details--
                
            Cappuccino Price:  $basePrice$    
            Sugar Price:       $sugarPrice$
            Milk price:        $milkPrice$
            Cinnamon Price:    ${cinnamonPrice()}$
            
            Coffee Cappuccino:  $sugarQuantity Sugar, $milkQuantity Milk. $hasCinnamon 
            
                                                     Total fee: $price$
        """
        )
    }

    companion object {
        private const val basePrice = 3.5
    }
}
