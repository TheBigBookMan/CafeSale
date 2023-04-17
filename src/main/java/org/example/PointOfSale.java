package org.example;
import java.util.ArrayList;

/*
Using a Command Behavioural Pattern design for the point of sale, as customers can provide an object request with
multiple abstract parameters. This requires a design pattern that can return multiple varied results depending on the
parameters given.
PointOfSale is the invoker class where the object requesting the command to execute is created.
 This would be connected to the UI to gather the coffee parameters.
 */
public class PointOfSale {
    //  The main method for order initialization
    public static void main(String[] args) {
//      Hardcode testing of the program
        ArrayList<String> orderCondiments1 = new ArrayList<>();
        orderCondiments1.add("Sugar");

//      Initialize and declare the order
        PlaceOrder newOrder = new PlaceOrder("Robusta", "Cappuccino", "Addict", orderCondiments1);
        double total1 = newOrder.getTotal();
        System.out.println("The total to pay is $" + total1);

        ArrayList<String> orderCondiments2 = new ArrayList<>();
        orderCondiments2.add("Milk");
        orderCondiments2.add("Sugar");
        orderCondiments2.add("Coco Powder");
        PlaceOrder newOrder2 = new PlaceOrder("Arabica", "Mocha", "Standard", orderCondiments2);
        double total2 = newOrder2.getTotal();
        System.out.println("The total to pay is $" + total2);
    }
}