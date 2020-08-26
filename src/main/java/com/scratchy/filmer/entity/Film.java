package com.scratchy.filmer.entity;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private String title;
    private String producer;
    private int yearOfProd;
    private double rate;
    private List<String> actors = new ArrayList<>();
    private String genre;

    public Film() {}

    public Film(String title, String producer, int yearOfProd, double rate, List<String> actors, String genre) {
        this.title = title;
        this.producer = producer;
        this.yearOfProd = yearOfProd;
        this.rate = rate;
        this.actors = actors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film: " +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", rate=" + rate +
                ", actors=" + actors + ", genre = " + genre + "\n";
    }

    public String getInfo(){
        return title;
    }
}