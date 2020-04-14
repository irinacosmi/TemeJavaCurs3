package com.java.training.d03.teme.car;

import java.util.Objects;

public abstract class AbstractCar {
    private final String name;
    private final String type;
    private final double price;
    private final String fuel;
    private final int power;

    public AbstractCar(String name, String type, double price, String fuel, int power) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.fuel = fuel;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getFuel() {
        return fuel;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCar that = (AbstractCar) o;
        return Double.compare(that.price, price) == 0 &&
                power == that.power &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type) &&
                Objects.equals(fuel, that.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price, fuel, power);
    }

    @Override
    public String toString() {
        return  name + " " +  type + " " + price;
    }

    public abstract void displayCar();


}
