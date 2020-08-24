package javaStudy.javaEx.oop.shape.v1;

public class Rectangle extends Shape{

	protected int width;
	protected int height;

	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public void draw() {
		System.out.printf("사각형 (x = %d, y = %d, area = %f)을 그렸습니다. %n", x, y, area());
		
	}

}
