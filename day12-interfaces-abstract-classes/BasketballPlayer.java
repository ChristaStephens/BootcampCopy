
public class BasketballPlayer extends Player {

	private double freethrowPercentage;

	public BasketballPlayer() {
	}

	public BasketballPlayer(String name,
							int jerseyNumber,
							double freethrowPercentage) {
		super(name, jerseyNumber);
		this.freethrowPercentage = freethrowPercentage;
	}

	public double getFreethrowPercentage() {
		return freethrowPercentage;
	}

	public void setFreethrowPercentage(double freethrowPercentage) {
		this.freethrowPercentage = freethrowPercentage;
	}
	
	@Override
	public void score() {
		System.out.println("Make a basket");
	}
	
	public void scoreBasket() {
		System.out.println("2 points!");
	}

}
