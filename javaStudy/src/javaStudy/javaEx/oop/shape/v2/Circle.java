package javaStudy.javaEx.oop.shape.v2;

public class Circle extends Shape implements Drawable{

	protected double radius;
	
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	
	
	
	@Override
	public double area() {
		double result = Math.PI * Math.pow(radius, 2);
		return result;
	}
	

	@Override
	public void draw() {
		System.out.printf("원 (x = %d, y =%d, r = %f, area = %f)을 그렸습니다. %n",x,y,radius,area());
		
	}



}
