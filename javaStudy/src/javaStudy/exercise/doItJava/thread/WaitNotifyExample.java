package javaStudy.exercise.doItJava.thread;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		ta.start();
		tb.start();
	}

}
