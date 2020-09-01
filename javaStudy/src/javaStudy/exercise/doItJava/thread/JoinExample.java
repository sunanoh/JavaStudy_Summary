package javaStudy.exercise.doItJava.thread;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		
		
		
		System.out.println("1~100 합 : "+sumThread.getSum());

	}

}
