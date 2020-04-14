package com.java.training.d03.teme.holiday;

public class Weekend extends AbstractHoliday{
    private String movie;

    public Weekend(String movie) {
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public void goingOut() {
        System.out.println("I'm not going out, i'm gonna see " + getMovie());
    }
}
