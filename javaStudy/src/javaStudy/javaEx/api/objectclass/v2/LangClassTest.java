package javaStudy.javaEx.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		}

}
