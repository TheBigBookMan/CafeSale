package org.example;
// Parent class for the different types of coffee: name and price
public class CoffeeType {
    protected String name;
    protected double typePrice;

    public CoffeeType(String coffeeType) {
        this.name = coffeeType;
    }

    public double getPrice(){
        return this.typePrice;
    }

    public String getName() {
        return this.name;
    }

    //    Check the coffee type input by the customer and return the price
    public double price() {
        CoffeeType selectedCoffeeType;
        if(name.equals("House Blend")) {
            selectedCoffeeType = new HouseBlend();
        } else if(name.equals("Dark Roast")) {
            selectedCoffeeType = new DarkRoast();
        } else if(name.equals("Robusta")) {
            selectedCoffeeType = new Robusta();
        } else if(name.equals("Arabica")) {
            selectedCoffeeType = new Arabica();
        } else {
            selectedCoffeeType = new HouseBlend();
        }
        System.out.println(selectedCoffeeType.getName() + " is in stock!");
        return selectedCoffeeType.getPrice();
    }
}

// Subclasses for different types of coffee
class HouseBlend extends CoffeeType {
    public HouseBlend() {
        super("House Blend");
        this.typePrice = 1.0;
    }
}

class DarkRoast extends CoffeeType {
    public DarkRoast() {
        super("Dark Roast");
        this.typePrice = 1.5;
    }
}

class Robusta extends CoffeeType{
    public Robusta(){
        super("Robusta");
        this.typePrice = 2.0;
    }
}

class Arabica extends CoffeeType {
    public Arabica() {
        super("Arabica");
        this.typePrice = 2.5;
    }
}