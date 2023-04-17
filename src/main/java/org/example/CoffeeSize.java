package org.example;
// Parent class for the different sizes of coffee: name and price
public class CoffeeSize {
    protected String name;
    protected double sizePrice;

    public CoffeeSize(String coffeeSize) {
        this.name = coffeeSize;
    }

    public double getPrice() {
        return this.sizePrice;
    }

    public String getName() {
        return this.name;
    }

    //    Check the coffee size input by the customer and return the price
    public double price() {
        CoffeeSize coffeeSize;
        if(this.name.equals("Standard")) {
            coffeeSize = new Standard();
        } else if(this.name.equals("Child")) {
            coffeeSize = new Child();
        } else if(this.name.equals("Large")) {
            coffeeSize = new Large();
        } else if(this.name.equals("Addict")) {
            coffeeSize = new Addict();
        } else {
            coffeeSize = new Standard();
        }
        System.out.println(coffeeSize.getName() + " is in stock!");
        return coffeeSize.getPrice();
    }
}

// Subclasses for different sizes of coffee
class Standard extends CoffeeSize {
    public Standard() {
        super("Standard");
        this.sizePrice = 1.0;
    }
}

class Child extends CoffeeSize {
    public Child(){
        super("Child");
        this.sizePrice = 0.75;
    }
}

class Large extends CoffeeSize {
    public Large() {
        super("Large");
        this.sizePrice = 1.5;
    }
}

class Addict extends CoffeeSize {
    public Addict() {
        super("Addict");
        this.sizePrice = 2.0;
    }
}