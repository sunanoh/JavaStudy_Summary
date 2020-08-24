package javaStudy.javaEx.oop.staticmember.singleton;

public class SingletonExBookApp {

	public static void main(String[] args) {
	
		SingletonExBook s = SingletonExBook.getInstance();
		SingletonExBook s2 = SingletonExBook.getInstance();
		System.out.println((s == s2));
		

	}

}
