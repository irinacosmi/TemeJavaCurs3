package com.java.training.d03.teme.settlement;

import java.util.Objects;

public abstract class AbstractSettlement {

    private String name;
    private int numberCitiziens;
    private String pollucionDegree;

    public AbstractSettlement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberCitiziens() {
        return numberCitiziens;
    }

    public void setNumberCitiziens(int numberCitiziens) {
        this.numberCitiziens = numberCitiziens;
    }

    public String getPollucionDegree() {
        return pollucionDegree;
    }

    public void setPollucionDegree(String pollucionDegree) {
        this.pollucionDegree = pollucionDegree;
    }

    public abstract void displayInfo();

    public String displayAbout(){
        String about ="I live in " + getName();
        return about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSettlement that = (AbstractSettlement) o;
        return numberCitiziens == that.numberCitiziens &&
                Objects.equals(name, that.name) &&
                Objects.equals(pollucionDegree, that.pollucionDegree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberCitiziens, pollucionDegree);
    }
}
