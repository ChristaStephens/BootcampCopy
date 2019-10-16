package co.grandcircus.threads.userlist;

public class UserListApp {

	public static void main(String[] args) throws InterruptedException {
		// User list is designed to prevent duplicates.
		UserList userList = new ThreadUnsafeUserList();
//		UserList userList = new ThreadSafeUserList();
		
		// Three threads adding users at the same time.
		UserAddingThread thread1 = new UserAddingThread(userList, "Abe", "Bob", "Cat", "Deb", "Edd", "Fay");
		UserAddingThread thread2 = new UserAddingThread(userList, "Abe", "Bob", "Cat", "Deb", "Edd", "Fay");
		UserAddingThread thread3 = new UserAddingThread(userList, "Abe", "Bob", "Cat", "Deb", "Edd", "Fay");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		// wait for all three threads to finish
		thread1.join();
		thread2.join();
		thread3.join();
		
		userList.printUsers();
	}
}
