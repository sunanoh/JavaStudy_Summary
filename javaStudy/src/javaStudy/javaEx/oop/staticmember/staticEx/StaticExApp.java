package javaStudy.javaEx.oop.staticmember.staticEx;



//scope 연습
public class StaticExApp {

	public static void main(String[] args) {
		
		StaticEx s = new StaticEx();
		System.out.println("");

		StaticEx s1 = new StaticEx();
		System.out.println("");
		
		// static영역은 처음 1번만 초기화 되므로, 1번만 출력되고
		// 인스턴스가 생성될 때마다 생성자에 있는 대로 출력이 바뀜
	}

}
