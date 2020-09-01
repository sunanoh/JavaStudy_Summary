package javaStudy.exercise.doItJava.thread;

public class ThreadB extends Thread{

	private WorkObject workObject;
	
	public ThreadB(WorkObject wo) {
		this.workObject = wo;
	}
	
	public void run() {
		for(int i = 0 ; i< 10 ; i++) {
			workObject.method2();
		}
	}
}
