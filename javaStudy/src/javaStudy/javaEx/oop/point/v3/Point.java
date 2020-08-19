package javaStudy.javaEx.oop.point.v3;


// v3
// 매서드 오버로딩
public class Point {

	private int x;
	private int y;
	
	// 생성자
	//----------------------------
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//----------------------------
	
	
	// 메서드 오버로딩
	//---------------------------
	public void draw() {
		System.out.printf("점 [x = %d, y = %d]을 그렸습니다.%n", x, y);
	}
	
	
	public void draw(boolean show) {
		
		String message;
		
		if(show == true) {
			message = "그렸습니다.";
		}else {
			message = "지웠습니다.";
		}
		
		System.out.printf("점 [x = %d, y = %d]을 %s.%n", x, y, message);
		
	}
	
}
