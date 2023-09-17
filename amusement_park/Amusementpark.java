import java.util.*;

public class Amusementpark {
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	private ArrayList<Merchandise> merchandise = new ArrayList<Merchandise>();
	private String name = new String();
	
	public Amusementpark(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public ArrayList<Date> getTicketDates(){
		ArrayList<Date> date = new ArrayList<Date>();
		for (Ticket t : this.tickets) {
			if (t.getPurchaseStatus() == false) {
				System.out.println("Ticket ID:" + t.getNumber());
				date.add(t.getDate());
			};
		}
		return date;
	}

	public int getTicket(Date date){
		int result = 0;
		for (Ticket t : this.tickets) {
			if (t.getDate() == date) {
				result++;
			};
		}
		return result;
	}
	
	public Ticket getTicket(long id){
		Ticket result = null;
		for (Ticket t : this.tickets) {
			if (t.getNumber() == id) {
				result = t;
			};
		}
		return result;
	}
	
	public ArrayList<Merchandise> getMerchandise(){
		ArrayList<Merchandise> m = this.merchandise;
		return m;
	}
	

	public ArrayList<Merchandise> getMerchandise(String category){
		ArrayList<Merchandise> result = new ArrayList<Merchandise>();
		for(Iterator<Merchandise> c = this.merchandise.iterator(); c.hasNext();){
			Merchandise m = c.next();
			if (m.getCategory().equalsIgnoreCase(category)) {
				result.add(m);
				System.out.println(m);
			};
		}
		return result;	
	}

	public Merchandise getMerchandise(long id){
		Merchandise result = null;
		for (Merchandise m : this.merchandise) {
			if (m.getId() == id) {
				result = m;
			};
		}
		return result;
	}
	

	public void addTicket(Ticket t){
		this.tickets.add(t);
	}
	
	public void addMerchandise(Merchandise m){
		this.merchandise.add(m);
	}
	
	public void buyMerchandise(long id){
		try {
			for (Merchandise m : this.merchandise) {
				if (m.getId() == id) {
					this.merchandise.remove(this.merchandise.indexOf(m));
					System.out.println(m.getDescription() + " bought successfully!");
				};
			}
		} catch (Exception e) {
			System.out.println("Please, enter a valid Merchandise ID.");
		}
	}
	
	public void buyTicket(long id){
		try {
			 for(Iterator<Ticket> c = this.tickets.iterator(); c.hasNext();){
				Ticket t = c.next();
				if (t.getNumber() == id) {
					c.remove();
					System.out.println("Ticket " + t.getNumber() + " bought successfully!");
				};
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ticket not found. Try another ID.");
		} 
	}
}
