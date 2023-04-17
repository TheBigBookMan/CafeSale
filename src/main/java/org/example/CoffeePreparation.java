package org.example;
// Parent class for the different preparations of coffee: name and price
public class CoffeePreparation implements CoffeeVariables {
    protected String name;
    protected double preparationPrice;

    public CoffeePreparation(String chosenPreparation) {
        this.name = chosenPreparation;
    }

    public double getPrice() {
        return this.preparationPrice;
    }

    public String getName() {
        return this.name;
    }

    //    Check the coffee preparation input by the customer and return the price
    public double price(){
        CoffeePreparation coffeePreparation;
        if(this.name.equals("Espresso")) {
            coffeePreparation = new Espresso();
        } else if(this.name.equals("Latte")) {
            coffeePreparation = new Latte();
        } else if(this.name.equals("Cappuccino")) {
            coffeePreparation = new Cappuccino();
        } else if(this.name.equals("Macchiato")) {
            coffeePreparation = new Macchiato();
        } else if(this.name.equals("Mocha")) {
            coffeePreparation = new Mocha();
        } else {
            coffeePreparation = new Espresso();
        }

        System.out.println(coffeePreparation.getName() + " is in stock!");
        return coffeePreparation.getPrice();
    }
}

// Subclasses for different preparations of coffee
class Espresso extends CoffeePreparation {
    public Espresso(){
        super("Espresso");
        this.preparationPrice = 1.0;
    }
}

class Latte extends CoffeePreparation {
    public Latte(){
        super("Latte");
        this.preparationPrice = 1.25;
    }
}

class Cappuccino extends CoffeePreparation {
    public Cappuccino(){
        super("Cappuccino");
        this.preparationPrice = 1.5;
    }
}

class Macchiato extends CoffeePreparation {
    public Macchiato(){
        super("Macchiato");
        this.preparationPrice = 1.75;
    }
}

class Mocha extends CoffeePreparation {
    public Mocha(){
        super("Mocha");
        this.preparationPrice = 2.0;
    }
}
