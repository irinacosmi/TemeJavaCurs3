package com.java.training.d03.teme.car;

public class ElectricCar extends AbstractCar {
    private final String rechargeTime;

    public ElectricCar(String name, String type, double price, String fuel, int power, String rechargeTime) {
        super(name, type, price, fuel, power);
        this.rechargeTime = rechargeTime;
    }

    public String getRechargeTime() {
        return rechargeTime;
    }

    @Override
    public void displayCar() {
        System.out.println("I drive a " + getName());
    }
}
