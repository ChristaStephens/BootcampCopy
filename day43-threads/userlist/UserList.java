package co.grandcircus.threads.userlist;

import java.util.ArrayList;
import java.util.List;

public abstract class UserList {
	
	protected List<String> users = new ArrayList<>();
	
	public abstract void addUser(String user);
	
	public void printUsers() {
		System.out.println(users);
	}
	
	protected void simulateTimePassing() {
		try {
			Thread.sleep((long) (Math.random() * 30));
		} catch (InterruptedException e) {
			// Let it go...
		}
	}
	
	protected String getThreadTag() {
		return " (" + Thread.currentThread().getName() + ")";
	}

}
