package com.java.training.d03.teme.holiday;

import java.util.Objects;

public abstract class AbstractHoliday {
    private int numberDays;
    private String name;

    public AbstractHoliday() {
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractHoliday that = (AbstractHoliday) o;
        return numberDays == that.numberDays &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberDays, name);
    }

    @Override
    public String toString() {
        return numberDays + " "+ name ;
    }

    public void displayHoliday(){
        System.out.println("It is " + getName());
    }

    public abstract void goingOut();
}
