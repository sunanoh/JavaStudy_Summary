package javaStudy.javaEx.oop.point.v4;


// v4
// 상속
public class Point {

	// 상속받은 클래스에서도 사용할 수 있도록 제한 낮춤
	protected int x;
	protected int y;
	
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
