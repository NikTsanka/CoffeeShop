package coffeeshopjava;

public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachineJava = new CoffeeMachine();
        Double order = coffeeMachineJava.request();
        System.out.println(order);
    }
}
