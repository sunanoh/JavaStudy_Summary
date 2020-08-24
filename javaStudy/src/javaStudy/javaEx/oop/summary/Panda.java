package javaStudy.javaEx.oop.summary;

public class Panda extends Animal{

	public Panda(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.println("Panda 클래스 : zzzz...");
	}

}
