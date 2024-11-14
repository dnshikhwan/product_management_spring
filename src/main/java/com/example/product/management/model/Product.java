package com.example.product.management.model;

public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private Integer averageRating;

    public Product() {

    }

    public Product(String id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }
}
