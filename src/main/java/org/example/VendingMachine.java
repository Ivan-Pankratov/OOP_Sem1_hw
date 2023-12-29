package org.example;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume){
        for (Product product: products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk milk = (BottleOfMilk)product;
                if (milk.getValume() == volume){
                    return milk;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(int calories){
        for (Product product: products) {
            if (product instanceof Chocolate) {
                Chocolate choko = (Chocolate) product;
                if (choko.getCalories() == calories) return choko;
            }
        }
        return null;
    }
}
