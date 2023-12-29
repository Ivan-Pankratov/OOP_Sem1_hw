package org.example;

public class Chocolate extends Product{

    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String name, String brand, double price, int calories) {
        super(name, brand, price);
        this.calories = calories;
    }
    @Override
    public String displayInfo(){
        return String.format("[Шоколад]: %s - %s - %.2f; Ккал: %d",
                name, brand, price, calories);
    }
}
