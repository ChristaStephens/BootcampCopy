
public class RestaurantApp {

	public static void main(String[] args) {
		FoodOrder order = new FoodOrder();
		order.setBurgerCount(2);
		order.setFryCount(1);
		order.addFry();
		System.out.println(order);
		System.out.println(order.getTotal());
		
		System.out.println("The price of a burger is " + FoodOrder.BURGER_PRICE);
	}

}
