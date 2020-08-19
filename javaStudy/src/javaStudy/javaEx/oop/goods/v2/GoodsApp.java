package javaStudy.javaEx.oop.goods.v2;


// v2
public class GoodsApp {

	public static void main(String[] args) {

		
		// setter, getter 이용
		//----------------------------------------------
		Goods camera = new Goods();
	
		camera.setName("캐논");
		camera.setPrice(500000);
		
		System.out.printf("%s는 %d원 입니다.%n", camera.getName(), camera.getPrice());
		//----------------------------------------------
		
		// setter, 메서드 이용
		//----------------------------------------------
		Goods a = new Goods();
		a.setName("LG 그램");
		a.setPrice(900000);
		
		a.showInfo();
		//----------------------------------------------
	}

}
