package coffeeshopjava;

import java.util.Scanner;

public class CoffeeMachine {

    Scanner scanner = new Scanner(System.in);

    public double request() {
        System.out.println("Please Enter Coffee Type (Available Types: Latte, Cappuccino)");
        String coffeeType = scanner.next();
        if(coffeeType.equalsIgnoreCase("latte")){
            return new Latte(this.requestSugar(), this.requestMilk()).show();
        }else if (coffeeType.equalsIgnoreCase("Cappuccino")){
           return new Cappuccino(this.requestSugar(), this.requestMilk(), this.requestCinnamon()).show();
        }else {
            throw new Error("Unknown coffee type");
        }
/*        switch (coffeeType.toLowerCase()) {
            case "latte":
                new Latte(this.requestSugar(), this.requestMilk()).price();
                break;
            case "Cappuccino":
                new Cappuccino(this.requestSugar(), this.requestMilk(), this.requestCinnamon()).price();
                break;
        }
        throw new Error("Unknown coffee type");*/
    }

    private boolean requestCinnamon() {
        System.out.print("Do you want cinnamon: Y/N ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")) return true;
        else if (answer.equalsIgnoreCase("N")) return false;
        throw new Error("Invalid input!");
    }

    private int requestSugar() {
        System.out.print("Please enter sugar quantity: ");
        return scanner.nextInt();
    }

    private int requestMilk() {
        System.out.print("Please enter Milk  quantity: ");
        return scanner.nextInt();
    }
}
