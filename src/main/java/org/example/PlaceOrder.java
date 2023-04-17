package org.example;
import java.text.DecimalFormat;
import java.util.ArrayList;
/*
Use of multiple subclasses for each different coffee variable, eg (parent class- Coffee Type, subclasses-
Dark Roast, Robusta, House Blend and Arabica). I chose this design as each one can later be added with an inventory
count, amount of sales per item, specific discounts or promotional prices, easier to add in extra instance variables
with separate subclasses.

PlaceOrder is the receiver class and orders the coffee and returns the total pay
The total pay is presented in the terminal (just for the sake of the task) rather than returned
 */
public class PlaceOrder implements Order {
    //  Instance variables for placing the order
    private double totalPrice;
    private String type;
    private String preparation;
    private String size;
    private ArrayList<String> condiments;

    //  Constructor with order criteria
    public PlaceOrder(String type, String preparation, String size, ArrayList<String> condiments) {
        this.type = type;
        this.preparation = preparation;
        this.size = size;
        this.condiments = condiments;
        this.totalPrice = 0.0;
    }

    //  Get total price from each subclass coffee variable
    public double getTotal(){
        CoffeeType coffeeType = new CoffeeType(this.type);
        this.totalPrice += coffeeType.price();
        CoffeePreparation coffeePreparation = new CoffeePreparation(this.preparation);
        this.totalPrice += coffeePreparation.price();
        CoffeeSize coffeeSize = new CoffeeSize(this.size);
        this.totalPrice *= coffeeSize.price();

//      Loop through condiments arrayList
        for(String condiment : this.condiments) {
            Condiments condiments = new Condiments(condiment);
            this.totalPrice += condiments.price();
        }
        double toPay = this.totalToPay();
        return toPay;
    }

    //  Total for customer to pay (rounded to 2 decimals)
    public double totalToPay(){
        DecimalFormat df = new DecimalFormat("#.##");
        double roundedPrice = Double.parseDouble(df.format(this.totalPrice));
        return roundedPrice;
    }
}