package co.grandcircus.threads.userlist;

public class ThreadSafeUserList extends UserList {
	
	synchronized public void addUser(String user) {
		if (!users.contains(user)) {
			simulateTimePassing(); // slowing it down increases possibility of overlapping threads
			users.add(user);
			System.out.println("Added " + user + getThreadTag());
		} else {
			System.out.println("Not adding duplicate " + user + getThreadTag());
		}
	}

}
