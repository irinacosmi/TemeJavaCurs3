package com.java.training.d03.teme.settlement;

public class Town extends AbstractSettlement {

    private String townHolliday;

    public Town() {
    }


    public String getTownHoliday() {
        return townHolliday;
    }

    public void setTownHolliday(String townHolliday) {
        this.townHolliday = townHolliday;
    }

    @Override
    public void displayInfo() {
        System.out.println( getName() + " " + getNumberCitiziens() + " " + getTownHoliday());
    }

    @Override
    public String displayAbout() {
        String about = super.displayAbout() + " " + getTownHoliday();
        return about;
    }
}


