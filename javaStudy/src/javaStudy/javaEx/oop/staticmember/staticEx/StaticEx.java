package javaStudy.javaEx.oop.staticmember.staticEx;



// scope 연습
public class StaticEx {
	
	public static int refCount;      // 클래스 변수
	public static String classVar;   // 클래스 변수
	public String instanceVar;       // 인스턴스 변수
	
	
	// static 영역의 초기화
	// static 변수는 처음 초기화 1번만 하고, 인스턴스 생성되어도 다시 초기화 되지 않음
	static {
		refCount = 0;
		classVar = "Static Member";
		
		System.out.println("Static 영역 초기화 완료");
	}
	
	
	// 생성자 ----------------------------------------
	public StaticEx(){
		refCount ++;
		instanceVar = "Instance Member";
		System.out.println("refCount :" + refCount);
		System.out.println("인스턴스 생성함!");
	}
	
	
	
}
