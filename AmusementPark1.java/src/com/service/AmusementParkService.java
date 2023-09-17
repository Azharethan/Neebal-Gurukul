package com.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.model.Merchandise;
import com.model.*;

public class AmusementParkService {
    private ArrayList<Ticket> tickets= new ArrayList<>();
    private ArrayList<Merchandise> merchandise = new ArrayList<>();
    private String name;

    public AmusementParkService(String string) {
		// TODO Auto-generated constructor stub
	}

	public void AmusementPark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Date> getTicketDates() {
        ArrayList<Date> dates = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (!ticket.getCategory().equals("UNKNOWN")) {
                dates.add(ticket.date);
            }
        }
        return dates;
    }

    public int getTickets(Date date) {
        int count = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getDate().equals(new SimpleDateFormat("MM/dd/yyyy").format(date))) {
                count++;
            }
        }
        return count;
    }

    public Ticket getTicket(long id) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumber() == id) {
                return ticket;
            }
        }
        return null;
    }

    public ArrayList<Merchandise> getMerchandise() {
        ArrayList<Merchandise> copy = new ArrayList<>(merchandise);
        return copy;
    }

    public ArrayList<Merchandise> getMerchandise(String category) {
        ArrayList<Merchandise> matchedItems = new ArrayList<>();
        for (Merchandise item : merchandise) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                matchedItems.add(item);
            }
        }
        return matchedItems;
    }

    public Merchandise getMerchandise(long id) {
        for (Merchandise item : merchandise) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void addMerchandise(Merchandise item) {
        merchandise.add(item);
    }

    public void buyMerchandise(String id) {
        Iterator<Merchandise> iterator = merchandise.iterator();
        while (iterator.hasNext()) {
            Merchandise item = iterator.next();
            if (String.valueOf(item.getId()).equals(id)) {
                iterator.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Merchandise not found with ID: " + id);
    }

    public void buyTicket(String id) {
        Iterator<Ticket> iterator = tickets.iterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            if (String.valueOf(ticket.getNumber()).equals(id)) {
                iterator.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Ticket not found with Number: " + id);
    }
}

