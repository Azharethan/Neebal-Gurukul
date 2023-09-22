package com.Test;
import java.util.Vector;
import java.util.Date;

import java.util.Scanner;
import java.util.Vector;

import com.model.AmusementPark;
import com.model.Merchandise;
import com.model.Ticket;

import java.util.Date;

public class AmusementParkTester {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmusementPark amusementPark = new AmusementPark("Walden Amusement Park");


        Ticket ticket1 = new Ticket(101,"adult",new Date(),400);
        Ticket ticket2 = new Ticket(102,"senior",new Date(),120);
        Ticket ticket3 = new Ticket(103,"adult",new Date(),350);
        Ticket ticket4 = new Ticket(104,"child",new Date(),120);
        Ticket ticket5 = new Ticket(105,"senior",new Date(),400);
        
        amusementPark.addTicket(ticket1);
        amusementPark.addTicket(ticket2);
        amusementPark.addTicket(ticket3);
        amusementPark.addTicket(ticket4);
        amusementPark.addTicket(ticket5);

        
        Merchandise merchandise1 = new Merchandise(101, "T-shirt", "Park Logo T-shirt",400,true);
        Merchandise merchandise2 = new Merchandise(102, "T-shirt", "Rollercoaster T-shirt",700,false);
        Merchandise merchandise3 = new Merchandise(103, "Cap", "Park Logo Cap",150,false);
        Merchandise merchandise4 = new Merchandise(104, "Cap", "Ferris Wheel Cap",460,true);
        amusementPark.addMerchandise(merchandise1);
        amusementPark.addMerchandise(merchandise2);
        amusementPark.addMerchandise(merchandise3);
        amusementPark.addMerchandise(merchandise4);
        
        Vector<Ticket> tickets;
        Vector<Merchandise> merchandise;
        
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.println("Welcome to " + amusementPark.getName() + " Gift Shop!");
            System.out.println("1. list of Avilable tickets: ");
            System.out.println("2. list of Avilable Mercandise: ");
            System.out.println("3. Look up Merchandise by Category");
            System.out.println("4. Book Ticket");
            System.out.println("5. Buy Merchandise");
            System.out.println("6. Booked Tickets");
            System.out.println("7. Purchased Merchandise");
            System.out.println("8. Add New Ticket");
            System.out.println("9. Add Merchandise");
            System.out.println("10. Exit");
       

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                	tickets= amusementPark.getTickets();
                	if(tickets.size()>0) {
                		for(Ticket tick:tickets) {
                    		System.out.println(tick);
                    	}
                	}else {
                		System.out.println("No Tickets Found");
                	}
                	break;
          
                case 2:
                	merchandise = amusementPark.getMerchandise();
                	if(merchandise.size()>0) {
                		for(Merchandise mer:merchandise) {
                    		System.out.println(mer);
                    	}
                	}else {
                		System.out.println("No Tickets Found");
                	}
                	break;
                case 3:
                    System.out.print("Enter Merchandise Category: ");
                    String category = scanner.nextLine().trim();
                    Vector<Merchandise> categoryMerchandise= amusementPark.getMerchandise(category);
                    if (categoryMerchandise.size() > 0) {
                        System.out.println("Merchandise in Category '" + category + "':");
                        for (Merchandise item : categoryMerchandise) {
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("No merchandise found in the '" + category + "' category.");
                    }
                    break;
                case 4:
                	System.out.println("Please Enter Ticket Id: ");
                	long id = scanner.nextLong();
                	System.out.println("Please Enter Name: ");
                	String bname = scanner.next();
                	amusementPark.bookTicket(id,bname);
                	System.out.println("Ticket Booked Succefully");
                	break;
                case 5:
                    System.out.print("Enter Merchandise ID to Buy: ");
                     long mid = scanner.nextLong();
                    try {
                        amusementPark.buyMerchandise(mid);
                        System.out.println("Merchandise with ID " + mid + " purchased successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:

                	Vector<Ticket> bookedT = amusementPark.bookedTickets();
                	if(bookedT.size()>0) {
                		System.out.println("Booked Tickets: ");
                    	for(Ticket tk:bookedT) {
                    		System.out.println(tk);
                    	}
                	}else {
                		System.out.println("No Tickets Booked");
                	}
                	
                	break;
                    
                case 7:
                	Vector<Merchandise> purchasedMerchandise = amusementPark.purchasedMerchandises();
                	if(purchasedMerchandise.size()>0) {
                		System.out.println("Purchased Merchandise: ");
                    	for(Merchandise mr:purchasedMerchandise) {
                    		System.out.println(mr);
                    	}
                	}else {
                		System.out.println("No Merchandise Purchased");
                	}
                	
                	break;
                	
                case 8:
                	tickets= amusementPark.getTickets();
                	int newId = tickets.size()+100;
                	System.out.print("Enter Ticket Category: (adult,child,senior)");
                    String ticketCategory = scanner.next().toLowerCase();
                    String name = null;
                    System.out.print("Enter Date: ");
                    System.out.print("Enter Day: ");
                    int day = scanner.nextInt();
                    System.out.print("Enter Month: ");
                    int month = scanner.nextInt();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    double price =400;
                    if(ticketCategory.equals("child")) {
                    	price = 120;
                    }else if(ticketCategory.equals("senior")) {
                    	price = 350;
                    }
                    amusementPark.addTicket(new Ticket(++newId,"adult",name,new Date(year,month-1,day),price));
                    System.out.println("Ticket Added  successfully.");
                	break;
                case 9:
                	merchandise= amusementPark.getMerchandises();
                	int mId = merchandise.size()+100;
                	System.out.println("Enter Merchandise Category: ");
                	category = scanner.next();
                	System.out.println("Enter Merchandise descriptionription: ");
                	String description = scanner.next();
                	System.out.println("Enter Merchandise Price: ");
                	price = scanner.nextDouble();
                	System.out.println("inStock(true/false): ");
                	boolean inStock  = scanner.nextBoolean();
                	
                    amusementPark.addMerchandise2(new Merchandise(++mId, category, description,price,inStock));
                    System.out.println("Merchandise Added Successfully.");
                    break;
                case 10:
                	continueShopping = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.print("Continue shopping? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                continueShopping = false;
            }
        }

        System.out.println("Thank you for visiting " + amusementPark.getName() + "!");
    }
}