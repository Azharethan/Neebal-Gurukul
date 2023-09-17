package com.model;

public class Merchandise {
    private long id;
    private String category;
    private String description;
    private double price;
    private boolean instock;

    public Merchandise(long id, String category, String description, double price, boolean instock) {
        this.id = id;
        this.category = validateCategory(category);
        this.description = description;
        this.price = price;
        this.instock = instock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInstock(boolean newStatus) {
        this.instock = newStatus;
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean getInstock() {
        return instock;
    }

    @Override
    public String toString() {
        return "Merchandise ID: " + id +
               "\nCategory: " + category +
               "\nDescription: " + description +
               "\nPrice: $" + price +
               "\nIn Stock: " + (instock ? "Yes" : "No");
    }

    private String validateCategory(String category) {
        if (category.equals("T-Shirt") || category.equals("Sweatshirt") || category.equals("Stuffed Animal")) {
            return category;
        } else {
            System.out.println("Invalid category. Setting to 'UNKNOWN'.");
            return "UNKNOWN";
        }
    }
}
