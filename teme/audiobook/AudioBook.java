package com.java.training.d03.teme.audiobook;


import com.java.training.d02.Book.Book;
import com.java.training.d02.Book.ImmutableBook;

public class AudioBook extends Book {

    private String type;
    private double time;

    public AudioBook(int id, String name, String author, String type, double time) {
        super(id, name, author);
        this.type = type;
        this.time = time;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String displayBookProperties() { // camelCase naming

        
       String display = super.displayBookProperties() + ", " + type + ", " + time;
       return display;
    }
}
