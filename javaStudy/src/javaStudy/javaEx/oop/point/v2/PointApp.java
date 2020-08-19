package javaStudy.javaEx.oop.point.v2;


// v2
public class PointApp {
	
	public static void main(String[] args) {
		
		// 기본 생성자 사용------------------------
		Point p1 = new Point();
		
		p1.setX(10);
		p1.setY(20);
		
		p1.draw();
	
		// 사용자 정의 생성자 사용------------------------
		Point p2 = new Point(30,40);
		p2.draw();
	}

}
