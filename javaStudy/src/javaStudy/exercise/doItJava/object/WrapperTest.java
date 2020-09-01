package javaStudy.exercise.doItJava.object;

public class WrapperTest {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		int v = i.intValue();
		System.out.println(v);
		
		Integer i2 = Integer.valueOf(400);
		System.out.println(i2);
	}

}
