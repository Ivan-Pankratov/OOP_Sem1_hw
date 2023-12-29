package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(null,
                "ООО Источник",1);
        //System.out.println(product1.displayInfo());

        Product product3 = new Product("Бутылка с молоком", 250);
        //System.out.println(product3.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Молоко №1",
                "ООО Источник", 250, 0.5,3.2);
        //System.out.println(bottleOfMilk1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода №1",
                "ООО Источник", 250, 0.5);
        //System.out.println(bottleOfWater1.displayInfo());
        Chocolate chocolate1 = new Chocolate("Шоколад №1",
                "ООО Источник", 250, 150);
        //System.out.println(chocolate1.displayInfo());
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Молоко №2",
                "ООО Источник", 250, 1.5,3.2);
        BottleOfMilk bottleOfMilk3 = new BottleOfMilk("Молоко №3",
                "ООО Источник", 250, 1.5,1.2);
        BottleOfMilk bottleOfMilk4 = new BottleOfMilk("Молоко №4",
                "ООО Источник", 250, 2.5,2.2);
        Chocolate chocolate2 = new Chocolate("Шоколад №2",
                "ООО Источник", 250, 650);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(chocolate1);
        products.add(chocolate2);

        VendingMachine machine = new VendingMachine(products);
/*
        BottleOfMilk bottleOfMilkResult = machine.getBottleOfMilk(0.5);
        if (bottleOfMilkResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

 */
// Есть шоколад с калорийностью 150 и 650
        Chocolate chocolateResult = machine.getChocolate(150);
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого товара нет в автомате.");
        }

    }
}