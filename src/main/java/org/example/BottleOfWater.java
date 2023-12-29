package org.example;

public class BottleOfWater extends Product{

    private double valume;

    public double getValume() {
        return valume;
    }

    public void setVaiume(double vaiume) {
        this.valume = valume;
    }

    public BottleOfWater(String name, String brand, double price, double valume) {
        super(name, brand, price);
        this.valume = valume;
    }
    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой]: %s - %s - %.2f; Объём: %.2f",
                name, brand, price, valume);
    }
}
