package javaStudy.javaEx.oop.point.v4;

public class ColorPoint extends Point{

	private String color;
	
	public ColorPoint(String Color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.color = color;
		
		System.out.println("Color point 생성자");
	}

	@Override
	public void draw() {
		System.out.printf("색상점 (%d, %d)을 그렸습니다.%n", x, y);
	}

	@Override
	public void draw(boolean show) {
		String message = show ? "그렸습니다." : "지웠습니다.";
		System.out.printf("색상점 (%d, %d)을 %s%n",x,y,message);
		
		System.out.println(" ---아래는 부모클래스의 draw(boolean) 실행결과");
		super.draw();
	}
	
	
	
	
	
}
