package javaStudy.exercise.doItJava.object;

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

class Circle implements Cloneable{
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x,y);
	}

	@Override
	public String toString() {
		return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10, 20, 30);
		Circle copy = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copy);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copy));
		
	}

}
