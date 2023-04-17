package org.example;
// Parent class for the different condiments: name and price
public class Condiments implements CoffeeVariables{
    protected double totalCondimentPrices = 0;
    protected double condimentPrice;
    protected String name;

    public Condiments(String condimentName) {
        this.name = condimentName;
    }

    public double getPrice(){
        return this.condimentPrice;
    }

    public String getName() {
        return this.name;
    }

    //    Check the condiment input by the customer, add to a local total and return the price
    public double price() {
        Condiments condiment;
        if(name.equals("Milk")) {
            condiment = new Milk();
        } else if(name.equals("Sugar")) {
            condiment = new Sugar();
        } else if(name.equals("Coco Powder")) {
            condiment = new CocoPowder();
        } else {
            condiment = new Milk();
        }
        totalCondimentPrices += condiment.getPrice();
        System.out.println(condiment.getName() + " is in stock!");
        return totalCondimentPrices;
    }
}

// Subclasses for the different condiments
class Milk extends Condiments {
    public Milk() {
        super("Milk");
        this.condimentPrice = 1.0;
    }
}

class Sugar extends Condiments {
    public Sugar() {
        super("Sugar");
        this.condimentPrice = 0.25;
    }
}

class CocoPowder extends Condiments {
    public CocoPowder() {
        super("Coco Powder");
        this.condimentPrice = 0.10;
    }
}

