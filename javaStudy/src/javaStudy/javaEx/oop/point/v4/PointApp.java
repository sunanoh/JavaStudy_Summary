package javaStudy.javaEx.oop.point.v4;


// v4 자식클래스
public class PointApp {
	
	public static void main(String[] args) {
		
		ColorPoint c = new ColorPoint("파랑");
		ColorPoint c1 = new ColorPoint(10, 20, "노랑");
		
		c.draw();
		c.draw(false);
		
		c1.draw(true);
	}

}
