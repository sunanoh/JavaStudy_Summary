package javaStudy.exercise.doItJava.thread;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		BeepTask thread = new BeepTask();
		thread.start();
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("띵"+i);
			
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
