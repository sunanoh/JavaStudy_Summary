package javaStudy.javaEx.oop.casting;

class Animal{
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name +"이(가) 먹고 있다.");
	}
	public void walk() {
		System.out.println(name + "이(가) 걷고 있다." );
	}
}

class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	public void meow() {
		System.out.println(name +" : 야옹 ~");
	}
}

class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	public void bark() {
		System.out.println(name + " : 멍멍!");
	}	
}

public class AnimalTest {

	public static void main(String[] args) {

		Dog d1 = new Dog("스누피");
		d1.bark();
		d1.eat();
		d1.walk();
		
		Animal d2 = new Dog("두기");
		d2.eat();
		d2.walk();
		
		Dog d3 = (Dog) d2;
		
		d3.bark();

	}

}
 


