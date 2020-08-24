package javaStudy.javaEx.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		
		Circle c= new Circle(10,10,30);
		c.draw();
		
		Drawable d = c;
		
		if(c instanceof Drawable) {
			System.out.println("맞음");
		}

	}

	private static void printObject(Drawable obj) {
		obj.draw();
	}
}
