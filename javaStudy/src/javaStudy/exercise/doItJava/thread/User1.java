package javaStudy.exercise.doItJava.thread;

public class User1 extends Thread{
	private Calculator cal;
	
	public void setCal(Calculator cal) {
		this.setName("Calculator User1");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(100);
	}
	
}
