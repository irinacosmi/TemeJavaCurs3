package com.java.training.d03.teme.car;

public class CarFamily extends AbstractCar{
       private final String kidsSeats;

    public CarFamily(String name, String type, double price, String fuel, int power, String kidsSeats) {
        super(name, type, price, fuel, power);
        this.kidsSeats = kidsSeats;
    }

    public String getKidsSeats() {
        return kidsSeats;
    }

    @Override
    public void displayCar() {
        System.out.println("My car has " + getKidsSeats() + " seats for kids.");
    }


}
