package com.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.model.AmusementPark;
import com.model.Ticket;

public class AmusementParkTest {
	 private AmusementPark amusementPark;

	    @Before
	    public void setUp() {
	        amusementPark = new AmusementPark("Test Park");
	    }

	    @Test
	    public void testAmusementParkName() {
	        assertEquals("Test Park", amusementPark.getName());
	    }

	    @Test
	    public void testAddTicket() {
	        Ticket ticket = new Ticket(101, "adult", new Date(), 500);
	        amusementPark.addTicket(ticket);
	        Vector<Ticket> tickets = amusementPark.getTickets();
	        assertNotNull(ticket);
	        assertEquals(1, tickets.size());
	        assertEquals(ticket, tickets.get(0));
	    }

	    private void assertNotNull(Ticket ticket) {
			// TODO Auto-generated method stub
			
		}

		@Test
	    public void testBookTicket() {
	        Ticket ticket = new Ticket(102, "child", new Date(), 120);
	        amusementPark.addTicket(ticket);
	        amusementPark.bookTicket(102, "Azhar");
	        Vector<Ticket> bookedTickets = amusementPark.bookedTickets();
	        Vector<Ticket> availableTickets = amusementPark.getTickets();
	        assertEquals(1, bookedTickets.size());
	        assertEquals(0, availableTickets.size());
	        assertEquals("Unavilable", bookedTickets.get(0).getAvalabilty());
	        assertEquals("Azhar", bookedTickets.get(0).getHolder());
	    }

}
