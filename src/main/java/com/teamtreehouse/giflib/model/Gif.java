package com.teamtreehouse.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private int categoryId;
    private String username;
    private boolean favorite;
    private String language;
    private String population;
    private String capitalCity;

    public Gif(String name, int categoryId, String username, boolean favorite, String language, String population, String capitalCity) {
        this.name = name;
        this.categoryId = categoryId;
        this.username = username;
        this.favorite = favorite;
        this.language = language;
        this.population = population;
        this.capitalCity = capitalCity;
    }

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguage() {return language;}

    public void setLanguage(String language) {this.language = language; }

    public String getPopulation() {return population;}

    public void setPopulation(String population) {this.population = population;}

    public String getCapitalCity() {return capitalCity;}

    public void setCapitalCity(String capitalCity) {this.capitalCity = capitalCity;}

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
