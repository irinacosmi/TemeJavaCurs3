package com.java.training.d03.teme.settlement;

import com.java.training.d03.teme.account.Admin;
import com.java.training.d03.teme.account.User;

public class SettlementMain {
    public static void main(String[] args) {
        Town town = new Town();
        town.setName("Resita");
        town.setNumberCitiziens(70000);
        town.setPollucionDegree("medium");
        town.setTownHolliday("29.06");

        City city = new City();
        city.setName("Timisoara");
        city.setNumberCitiziens(400000);
        city.setPollucionDegree("high");
        city.setCityHoliday("01.08");
        city.setNumberMall(4);

        System.out.println(town instanceof Town);
        System.out.println(city instanceof City);

        hashCode(town,city);
        equals(town);

        System.out.println(town.displayAbout());
        city.displayInfo();


    }

    private static void hashCode(Town town, City city) {
        System.out.println(town.hashCode());
        System.out.println(city.hashCode());
    }

    private static void equals(Town town){
        Town town1 = new Town();
        town1.setName("Timisioara");
        town1.setNumberCitiziens(400000);

        System.out.println(town.equals(town1));
    }
}
