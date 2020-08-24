package javaStudy.exercise.doItJava.abstractex;

abstract class Computer{
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	abstract void display();
	abstract void typing();
}

class DeskTop extends Computer{

	@Override
	void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	void typing() {
		System.out.println("DestTop typing()");
	}
}

abstract class Notebook extends Computer{

	@Override
	void display() {
		System.out.println("Notebook display()");
		
	}
}

class Mynotebook extends Notebook{

	@Override
	void typing() {
	System.out.println("Mynotebook typing()");
		
	}
	
}



public class ComputerEx {

	public static void main(String[] args) {
	
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		//Computer c3 = new Notebook();
		Computer c4 = new Mynotebook();
		
		
		c2.display();
		c2.typing();
		
		c4.display();
		c4.typing();
		
		
	}

}
