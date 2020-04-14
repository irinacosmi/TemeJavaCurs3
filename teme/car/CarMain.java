package com.java.training.d03.teme.car;

public class CarMain {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("VW", "3", 20000, "benzine", 122, 5);
        Sedan sedan1 = new Sedan("Mazda", "3", 19900, "benzine", 122, 5);

        ElectricCar electricCar = new ElectricCar("Nissan", "Leaf", 32999.99, "electric", 200, "o ora jumatate");
        ElectricCar electricCar1 = new ElectricCar("Nissan", "Leaf", 32999.99, "electric", 200, "o ora jumatate");
        System.out.println(electricCar instanceof ElectricCar);
        System.out.println(electricCar1 instanceof ElectricCar);
        electricCar.getRechargeTime();
        electricCar.displayCar();



        System.out.println(sedan instanceof Sedan);
        System.out.println(sedan.equals(sedan1));
        sedan.displayAbout();
        sedan1.displayCar();

        AbstractCar sedan2 = (AbstractCar) sedan;
        sedan.displayCar();
        sedan.displayAbout();

        System.out.println(sedan.toString());
        //System.out.println(electricCar.hashCode());

        hashCode(sedan1, electricCar1);
        hashCode(sedan, electricCar);
    }


    public static void hashCode(Sedan sedan, ElectricCar electricCar) {
        System.out.println(sedan.hashCode());
        System.out.println(electricCar.hashCode());
    }
}
