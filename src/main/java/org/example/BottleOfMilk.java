package org.example;

public class BottleOfMilk extends Product{
    private double valume;
    private double fat;

    public double getValume() {
        return valume;
    }

    public void setValume(double valume) {
        this.valume = valume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String name, String brand, double price, double valume, double fat) {
        super(name, brand, price);
        this.valume = valume;
        this.fat = fat;
    }

    @Override
    public String displayInfo(){
        return String.format("[Бутылка с молоком]: %s - %s - %.2f; Объём: %.2f; Жирность: %.2f",
                name, brand, price, valume, fat);
    }

}
