package javaStudy.javaEx.oop.goods.v3;


// v3
// 생성자 및 this 연습
public class Goods {
	
	private String name;
	private int price;
	
	// 생성자 --------------------------------
	public Goods(String name) {
		this.name = name;
		System.out.println("<name만 받는 생성자 실행>");
	}
	
	public Goods(String name, int price) {
		this(name);
		this.price = price;
		System.out.println("<name을 this로 받고, price와 같이 받는 생성자 실행>");
	}
	//----------------------------------------
	
	
	//---------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//---------------------------------------
	
	
	public void showInfo() {
		System.out.printf("%s의 가격은 %d 입니다.", name, price);
	}

}
