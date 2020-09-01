package javaStudy.exercise.doItJava.thread;

public class ThreadA extends Thread{

	
	private WorkObject workObject;
	
	
	public ThreadA(WorkObject wo) {
		this.workObject = wo;
	}
	
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			workObject.method1();
		}
	}
}
