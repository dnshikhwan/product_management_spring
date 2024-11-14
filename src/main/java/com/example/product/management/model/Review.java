package com.example.product.management.model;

public class Review {
    private Product product;
    private String feedback;
    private Integer rating;


    public Review() {

    }

    public Review(Product product, String feedback, Integer rating) {
        this.product = product;
        this.feedback = feedback;
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    public String getFeedback() {
        return feedback;
    }

    public Integer getRating() {
        return rating;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

