package javaStudy.javaEx.oop.staticmember.singleton;


// Do it 교재 예제
public class SingletonExBook {
	
	// 생성자를 private으로 설정, 외부 클래스에서 마음대로 인스턴스 생성할 수 없게 만듦
	private SingletonExBook() {	} 
	
	// 프로그램에서 사용할 유일하게 생성한 인스턴스
	// private으로 선언해서 외부에서 접근 불가능하도록 함
	private static SingletonExBook instance;

	
	// 외부에서 사용할 수 있게끔 public 메서드 선언
	public static SingletonExBook getInstance() {
	
		if(instance == null) {
			instance = new SingletonExBook();
		}
		return instance;
	}


	
	
	
	
	
	
}
