package javaStudy.javaEx.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SharedMemory sm = new SharedMemory();
		
		
		User user1 = new User("철수", sm, 100);
		user1.start();
		
		User user2 = new User("영희", sm, 200);
		user2.start();
	}

}
