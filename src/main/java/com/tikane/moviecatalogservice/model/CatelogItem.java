package com.tikane.moviecatalogservice.model;

public class CatelogItem {

    private String Name;
    private String Description;
    private int Rating;

    public CatelogItem(String name, String description, int rating) {
        this.Name = name;
        this.Description = description;
        this.Rating = rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        this.Rating = rating;
    }
}
