
public enum TicketType {
	
	// Call constructor when setting up the values
	CHILD(3.50), ADULT(5.00), SENIOR(4.00);
	
	// It is possible to add information to each option
	private double price;
	
	private TicketType(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

}
