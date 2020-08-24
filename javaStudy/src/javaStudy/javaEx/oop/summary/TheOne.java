package javaStudy.javaEx.oop.summary;

public class TheOne extends Human implements Flyable, Kungfu{

	public TheOne(String name, int age) {
		super(name, age);
	
	}

	@Override
	public void kungfu() {
		System.out.println(name + " : I know kungfu!");
		System.out.println("the one 클래스의 kung fu()");
	}

	@Override
	public void fly() {
		System.out.println(name + " : I believe I can fly");
		System.out.println("---the one 클래스의 fly()---");
		
	}
	
	

}
