package com.java.training.d03.teme.car;

public class Van extends AbstractCar {
    private final String subtype;

    public Van(String name, String type, double price, String fuel, int power, String subtype) {
        super(name, type, price, fuel, power);
        this.subtype = subtype;
    }

    public String getSubtype() {
        return subtype;
    }

    @Override
    public void displayCar() {
        System.out.println("I drive a new" + getName());
    }
}
