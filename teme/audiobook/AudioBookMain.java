package com.java.training.d03.teme.audiobook;

public class AudioBookMain {
    public static void main(String[] args) {
        AudioBook audioBook = new AudioBook(3, "Inferno", "Dan Brown", "thriller", 3.50);
        System.out.println(audioBook.displayBookProperties());
    }
}
