
public class FoodOrder {
	
	public static final double BURGER_PRICE = 5.0;
	public static final double FRY_PRICE = 3.0;
	
	private int burgerCount = 0;
	private int fryCount = 0;
	
	public FoodOrder() {}
	
	public FoodOrder(int burgerCount, int fryCount) {
		this.burgerCount = burgerCount;
		this.fryCount = fryCount;
	}
	
	public int getBurgerCount() {
		return burgerCount;
	}
	
	public void setBurgerCount(int burgerCount) {
		this.burgerCount = burgerCount;
	}
	
	public int getFryCount() {
		return fryCount;
	}
	
	public void setFryCount(int fryCount) {
		this.fryCount = fryCount;
	}
	
	public void addBurger() {
		burgerCount++;
	}
	
	public void addFry() {
		fryCount++;
	}
	
	public double getTotal() {
		return BURGER_PRICE * burgerCount + FRY_PRICE * fryCount;
	}
	
	@Override
	public String toString() {
		return "Order of " + burgerCount + " burgers and " + fryCount + " fries";
	}
	
}
