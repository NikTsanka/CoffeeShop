package coffeeshopjava;

public class Latte {

    private final double sugarPrice;
    private final int sugarQuantity;
    private final double milkPrice;
    private final int milkQuantity;

    public Latte(int sugarQuantity, int milkQuantity) {
        this.sugarPrice = 0.3;
        this.milkPrice = 0.5;
        this.sugarQuantity = sugarQuantity;
        this.milkQuantity = milkQuantity;
    }

    private double price() {
        final double basePrice = 4.5;
        return (basePrice + (sugarPrice * sugarQuantity) + (milkPrice * milkQuantity));
    }

    public double show(){

        System.out.println("\n             -- Order details --\n" +
                "Latte price: 4.5" +
                "\nSugar Price: "  + sugarPrice +
                "\nMilk price:  "  + milkPrice +
                "\nCoffee Latte with: " + sugarQuantity + " Sugar, " + milkQuantity + " Milk.");
        System.out.print("                    Total fee: "); return price();
    }

    /*@Override
    public String toString() {
        //double totalFee = price();
        return "\n             -- Order details --\n" +
                "Latte price: 4.5" +
                "\nSugar Price: " + sugarPrice +
                "\nMilk price: " + milkPrice +
                "\nCoffee Latte: " + sugarQuantity + " Sugar, " + milkQuantity + " Milk." +
                "\n                          Total fee: " + price() + "\n";
    }*/
}
