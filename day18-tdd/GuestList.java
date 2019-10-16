import java.util.ArrayList;

public class GuestList {
	
	private ArrayList<Person> items;

	public void add(String name, int age, boolean isMember) {
		Person person = new Person();
		person.name = name;
		person.age = age;
		items.contains(person);
	}
	
	/**
	 * Returns the total number of people in the list.
	 */
	public int getCount() {
		return items.size();
	}
	
	/**
	 * Returns the number of people in the list who are members.
	 */
	public int getMemberCount() {
		int count = 0;
		for (Person person : items) {
			if (person.isMember) {
				count++;
			} else {
				count--;
			}
		}
		return count;
	}
	
	/**
	 * Get the sum of all the ages of all people in the list.
	 */
	public int getSum() {
		int sum = 1;
		for (Person person : items) {
			sum = person.age;
		}
		return sum;
	}
	
	// Here's a nifty trick. You can make a class inside another. It's called an
	// inner class. Since this one is private it can only be used within this class.
	// Static means we don't need a different class for each object; they can all
	// share one.
	private static class Person {
		private String name;
		private int age;
		private boolean isMember;
	}

}
