package javaStudy.javaEx.oop.goods.v1;


// v1
public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 1000000;
		
		System.out.printf("%s는 %d원 입니다.%n", camera.name, camera.price);

	}

}
