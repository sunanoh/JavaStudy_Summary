package javaStudy.javaEx.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape c = new Circle(10,20,30);
		c.draw();
		
		Shape r = new Rectangle(10,10,30,40);
		r.draw();

	}

}
