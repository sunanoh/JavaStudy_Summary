package javaStudy.javaEx.thread.v2;

public class DigitThread extends Thread{

	@Override
	public void run() {
		
		for(int i=0; i <=15; i++) {
			System.out.printf("%s : %d%n", getName(), i);
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
