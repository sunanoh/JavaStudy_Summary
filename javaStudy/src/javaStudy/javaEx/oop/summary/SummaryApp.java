package javaStudy.javaEx.oop.summary;

public class SummaryApp {

	static Kungfu[] dojang;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Panda p1 = new Panda("핑", 30);
		//p1.say();
		Panda p2 = new KungfuPanda("포", 15);
		//p2.say();
	
		System.out.println("-----------------");
		
		Human h1 = new Human("홍길동", 20);
		//h1.say();
		Human h2 = new TheOne("네오", 50);
		//h2.say();
	
		fight(p1);
		fight(p2);
		fight(h1);
		fight(h2);
		
		
	}
	
	
	private static void fight(Animal actor) {
		if(actor instanceof Kungfu) {
			((Kungfu)actor).kungfu();
		}else {
			System.out.println(actor.name + " : 쿵후 못해요!");
			
		}
	}

}
