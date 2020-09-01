package javaStudy.javaEx.api.objectclass.v3;

public class Point implements Cloneable{

protected int x, y; 

	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	//	System.out.println("Point 생성자");
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]"; // 출력 포맷
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		}
		
		return super.equals(obj);
	}
	
	
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("복제 불가 객체!");
		}
		
		return clone;
	}
	
}
