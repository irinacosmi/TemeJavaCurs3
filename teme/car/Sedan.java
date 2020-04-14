package com.java.training.d03.teme.car;

public class Sedan extends AbstractCar{
    private final int seats;

    public Sedan(String name, String type, double price, String fuel, int power, int seats) {
        super(name, type, price, fuel, power);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void displayCar() {
        System.out.println("I can't drive a " + getName());
    }

    public void displayAbout(){
        System.out.println(getPrice() + " " + getPower() + " " + getSeats());
    }

}
