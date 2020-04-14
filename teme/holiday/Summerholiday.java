package com.java.training.d03.teme.holiday;

public class Summerholiday extends AbstractHoliday{
    public Summerholiday(String location) {
        this.location = location;
    }

    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void goingOut() {
        System.out.println("We are going for " + getNumberDays() + " in " + getLocation());
    }

    @Override
    public void displayHoliday() {
        System.out.println("We celebrate " + getName());
    }

}
