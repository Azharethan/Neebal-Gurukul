package com.model;

import java.util.*;
import java.text.SimpleDateFormat;

public class Ticket {
    private long number;
    private String category;
    private String holder;
    private double price;
    private boolean purchaseStatus;
	public Date date;

    public Ticket(long number, String category, String holder, Date date, double price, boolean purchaseStatus) {
        this.number = number;
        this.category = category;
        this.holder = holder;
        this.date = date;
        this.price = price;
        this.purchaseStatus = purchaseStatus;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void changePurchaseStatus(boolean newStatus) {
        this.purchaseStatus = newStatus;
    }

    public long getNumber() {
        return number;
    }

    public String getCategory() {
        return category;
    }

    public String getHolder() {
        return holder;
    }

    public String getDate() {
        SimpleDateFormat d = new SimpleDateFormat("MM/dd/yyyy");
        return d.format(date);
    }

    public double getPrice() {
        return price;
    }

    
    public String toString() {
        return "Ticket Number: " + number +
               "\nCategory: " + category +
               "\nHolder: " + holder +
               "\nDate: " + getDate() +
               "\nPrice: $" + price +
               "\nPurchase Status: " + (purchaseStatus ? "Purchased" : "Reserved");
    }
}