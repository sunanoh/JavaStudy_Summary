package javaStudy.exercise.doItJava.thread;

public class ThreadStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		
		spt.start();
		
		

	}

}
