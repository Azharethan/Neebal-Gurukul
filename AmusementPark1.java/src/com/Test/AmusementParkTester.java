package com.Test;
import com.service.*;
import com.model.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AmusementParkTester {
    public static void main(String[] args) {
        AmusementParkService amusementPark = new AmusementParkService("Walden Amusement Park");

        
        Ticket ticket1 = new Ticket(1, "adult", "yash", new Date(), 100, true);
        Ticket ticket2 = new Ticket(2, "child", "raunak", new Date(), 80, true);
        Ticket ticket3 = new Ticket(3, "adult","sagar", new Date(), 100, false);

        amusementPark.addTicket(ticket1);
        amusementPark.addTicket(ticket2);
        amusementPark.addTicket(ticket3);

        
        Merchandise merchandise1 = new Merchandise(101, "T-Shirt", "Cool T-Shirt", 230, true);
        Merchandise merchandise2 = new Merchandise(102, "Sweatshirt", "Warm Sweatshirt", 500, false);
        Merchandise merchandise3 = new Merchandise(103, "Stuffed Animal", "Cute Stuffed Animal", 800, true);
        Merchandise merchandise4 = new Merchandise(104, "Hat", "Fancy Hat", 150, true);

        amusementPark.addMerchandise(merchandise1);
        amusementPark.addMerchandise(merchandise2);
        amusementPark.addMerchandise(merchandise3);
        amusementPark.addMerchandise(merchandise4);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWalden Amusement Park Menu:");
            System.out.println("1. Look up tickets by date");
            System.out.println("2. Look up merchandise by category");
            System.out.println("3. Purchase merchandise");
            System.out.println("4. Purchase ticket");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (MM/dd/yyyy): ");
                    scanner.nextLine();
                    String dateStr = scanner.nextLine();
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                        Date date = sdf.parse(dateStr);
                        int availableTickets = amusementPark.getTickets(date);
                        System.out.println("Tickets available on " + dateStr + ": " + availableTickets);
                    } catch (Exception e) {
                        System.out.println("Invalid date format.");
                    }
                    break;

                case 2:
                    System.out.print("Enter merchandise category: ");
                    scanner.nextLine();
                    String category = scanner.nextLine();
                    ArrayList<Merchandise> matchedMerchandise = amusementPark.getMerchandise(category);
                    if (matchedMerchandise.isEmpty()) {
                        System.out.println("No merchandise found in this category.");
                    } else {
                        System.out.println("Merchandise in " + category + " category:");
                        for (Merchandise item : matchedMerchandise) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter merchandise ID to purchase: ");
                    scanner.nextLine();
                    String merchId = scanner.nextLine();
                    try {
                        amusementPark.buyMerchandise(merchId);
                        System.out.println("Merchandise with ID " + merchId + " purchased successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter ticket number to purchase: ");
                    scanner.nextLine();
                    String ticketNumber = scanner.nextLine();
                    try {
                        amusementPark.buyTicket(ticketNumber);
                        System.out.println("Ticket with Number " + ticketNumber + " purchased successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Thank you for visiting Walden Amusement Park!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
