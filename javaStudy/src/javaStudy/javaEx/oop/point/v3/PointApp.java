package javaStudy.javaEx.oop.point.v3;


// v3
public class PointApp {
	
	public static void main(String[] args) {
		
		Point p = new Point(20, 30);
		
		p.draw();
		p.draw(false);
		p.draw(true);
	}

}
