package javaStudy.exercise.doItJava.classex;

public class ClassTest {

	public static void main(String[] args) {
	
		Person p = new Person();
		Class pClass1 = p.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
	}

}
