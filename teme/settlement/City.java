package com.java.training.d03.teme.settlement;

public class City extends AbstractSettlement{

    private String cityHoliday;
    private int numberMall;

    public City() {
    }

    public String getCityHoliday() {
        return cityHoliday;
    }

    public void setCityHoliday(String cityHoliday) {
        this.cityHoliday = cityHoliday;
    }

    public int getNumberMall() {
        return numberMall;
    }

    public void setNumberMall(int numberMall) {
        this.numberMall = numberMall;
    }

    @Override
    public void displayInfo() {
        System.out.println( getName() + " " + getNumberCitiziens() + " " + getCityHoliday() + " " + getNumberMall());
    }

    @Override
    public String displayAbout() {
        String about = super.displayAbout() + " and we have " + getNumberMall();
        return about;
    }

    @Override
    public String toString() {
        return  cityHoliday +  numberMall ;
    }
}
