package javaStudy.javaEx.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {


		Point p = new Point(10, 20);
		System.out.println("p = " + p);
		System.out.println(System.identityHashCode(p));
		
		Point p2 = p.getClone();
		System.out.println("p2 = " + p2);
		System.out.println(System.identityHashCode(p2));
		System.out.println("p == p2 ? "+ (p == p2));
		
		
		
		//p2.setX(30);
		//p2.setY(100);
		
		System.out.println("p2 = " + p2);
		}

}
