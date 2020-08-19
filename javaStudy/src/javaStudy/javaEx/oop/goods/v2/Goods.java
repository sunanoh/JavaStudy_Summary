package javaStudy.javaEx.oop.goods.v2;


// v2
// 캡슐화 연습
public class Goods {
	
	private String name;
	private int price;
	
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
