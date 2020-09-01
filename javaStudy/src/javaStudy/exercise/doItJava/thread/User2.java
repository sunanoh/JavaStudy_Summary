package javaStudy.exercise.doItJava.thread;

public class User2 extends Thread{
	private Calculator cal;
	
	public void setCal(Calculator cal) {
		this.setName("Calculator User2");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(50);
	}
}
