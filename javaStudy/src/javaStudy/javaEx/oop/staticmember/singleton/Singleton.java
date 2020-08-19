package javaStudy.javaEx.oop.staticmember.singleton;


// 싱글톤 연습
// 전체 프로그램 상에서 동일한 인스턴스를 사용해야 할 경우 활용
public class Singleton {

	private static Singleton instance;
	
	
	private Singleton() {	}  // 절대 호출되면 안되는 경우, private으로 선언한다.
	
	
	// getter를 만들어서 우회 접근
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
