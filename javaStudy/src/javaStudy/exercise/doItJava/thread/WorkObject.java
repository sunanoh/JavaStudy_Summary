package javaStudy.exercise.doItJava.thread;

public class WorkObject {

	public synchronized void method1() {
		System.out.println("Thread A의 method1 작업 실행 ");
		
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public synchronized void method2() {
		System.out.println("Thread B의 method2 작업 실행");
		
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


