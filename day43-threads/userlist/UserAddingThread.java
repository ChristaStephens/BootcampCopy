package co.grandcircus.threads.userlist;

public class UserAddingThread extends Thread {

	private UserList userList;
	private String[] usersToAdd;

	public UserAddingThread(UserList userList, String... usersToAdd) {
		this.userList = userList;
		this.usersToAdd = usersToAdd;
	}

	@Override
	public void run() {
		for (String user : usersToAdd) {
			userList.addUser(user);
		}
	}

}
