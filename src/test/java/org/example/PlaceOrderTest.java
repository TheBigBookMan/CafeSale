package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

// Use of JUnit test for the overall order with different order types
class PlaceOrderTest {
    @Test
    public void testCalculateTotalCost() {
        ArrayList<String> condiments1 = new ArrayList<String>();
        condiments1.add("Milk");
        condiments1.add("Sugar");

        PlaceOrder coffeeOrder1 = new PlaceOrder("House blend", "Espresso", "Large", condiments1);
        double totalCost1 = coffeeOrder1.getTotal();

        assertEquals(4.25, totalCost1);
    }

    @Test
    public void testCalculateTotalCost2() {
        ArrayList<String> condiments2 = new ArrayList<String>();
        condiments2.add("Milk");
        condiments2.add("Sugar");
        condiments2.add("Coco Powder");

        PlaceOrder coffeeOrder2 = new PlaceOrder("Arabica", "Macchiato", "Addict", condiments2);
        double totalCost2 = coffeeOrder2.getTotal();

        assertEquals(9.85, totalCost2);
    }
}