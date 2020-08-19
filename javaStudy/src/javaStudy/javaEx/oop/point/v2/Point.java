package javaStudy.javaEx.oop.point.v2;


// v2
// 생성자 오버로딩 연습
public class Point {

	private int x;
	private int y;
	
	// 생성자
	//----------------------------
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//----------------------------
	
	
	// getter, setter
	//----------------------------
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//----------------------------
	
	//---------------------------
	public void draw() {
		System.out.printf("점 [x = %d, y = %d]을 그렸습니다.%n", x, y);
	}
	
	
}
