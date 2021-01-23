package coffeeshopjava;

public class Cappuccino {

    private final double sugarPrice;
    private final int sugarQuantity;
    private final double milkPrice;
    private final int milkQuantity;
    private final boolean withCinnamon;

    public Cappuccino(int sugarQuantity, int milkQuantity, boolean withCinnamon) {
        this.sugarPrice = 0.3;
        this.milkPrice = 0.5;
        this.sugarQuantity = sugarQuantity;
        this.milkQuantity = milkQuantity;
        this.withCinnamon = withCinnamon;
    }

    private double cinnamonPrice() {
         return this.withCinnamon ? 0.15 : 0.0;
    }

    double price() {
        final double basePrice = 3.5;
        return (basePrice + (sugarPrice * sugarQuantity) + (milkPrice * milkQuantity) + cinnamonPrice());
    }

    public double show(){
       String hasCinnamon;
       if (withCinnamon)  hasCinnamon = "With Cinnamon."; else hasCinnamon = "";
        System.out.println("\n             -- Order details --\n" +
                "Cappuccino price: 4.5" +
                "\nSugar Price: "  + sugarPrice +
                "\nMilk price:  "  + milkPrice +
                "\nCinnamon Price: " + cinnamonPrice() +
                "\nCappuccino with: " + sugarQuantity + " Sugar, " + milkQuantity + " Milk. " + hasCinnamon);
        System.out.print("                    Total fee: "); return price();
    }

    /*@Override
    public String toString() {
        //double totalFee = price();
        return "\n              -- Order details --\n" +
                "Cappuccino price: 3.5" +
                "\nSugar Price: " + sugarPrice +
                "\nMilk price: " + milkPrice +
                "\nCinnamon Price: " + cinnamonPrice() +
                "\nCoffee Cappuccino: " + sugarQuantity + " Sugar, " + milkQuantity + " Milk." +
                "\n                            Total fee: " + price() + "\n";
    }*/
}
