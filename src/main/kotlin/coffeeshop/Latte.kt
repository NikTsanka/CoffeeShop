package coffeeshop

class Latte(
    private val sugarPrice: Double,
    private val sugarQuantity: Int,
    private val milkPrice: Double,
    private val milkQuantity: Int
) {

    constructor(
        sugarQuantity: Int,
        milkQuantity: Int
    ) : this(
        sugarPrice = 0.3,
        milkPrice = 0.7,
        sugarQuantity = sugarQuantity,
        milkQuantity = milkQuantity
    )

    private fun price() = basePrice + (sugarPrice * sugarQuantity) + (milkPrice * milkQuantity)

    fun show() {
        val price = String.format("%.2f", price())
        println()
        println(
            """                           -- Order details --
                
            Caffe Latte Price: $basePrice$    
            Sugar Price:       $sugarPrice$
            Milk price:        $milkPrice$  
            
            Coffee Latte:  $sugarQuantity Sugar, $milkQuantity Milk. 
            
                                       Total fee: $price$
        """
        )
    }

    companion object {
        private const val basePrice = 4.5
    }
}