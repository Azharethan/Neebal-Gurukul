public class Merchandise {
	private long id;
	private String category = new String();
	private String description = new String();
	private double price;
	private boolean inStock;

	public Merchandise() {

	}

	public Merchandise(long id, String category, String description, double price, boolean inStock) {
		if (category.equalsIgnoreCase("T-Shirt")) {
			this.category = category;
		} else if (category.equalsIgnoreCase("Sweatshirt")) {
			this.category = category;
		} else if (category.equalsIgnoreCase("Badge")) {
			this.category = category;
		} else if (category.equalsIgnoreCase("Cap")) {
			this.category = category;
		} else {
			System.out.println("Invalid Merchandise category.");
			this.category = "UNKNOWN";
		}

		this.description = description;
		this.id = id;
		this.price = price;
		this.inStock = inStock;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	public void setInstock(boolean newStatus) {
		this.inStock = newStatus;
	}

	public long getId() {
		return this.id;
	}

	public String getCategory() {
		return this.category;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPrice() {
		return this.price;
	}

	public boolean getInstock() {
		return this.inStock;
	}

	public String toString() {
		return "Merchandise [id = " + getId() + ", category = " + getCategory() + ", description = " + getDescription()
				+ ", \n"
				+ " price = " + getPrice() + ", inStock = " + getInstock() + "]";
	}

}