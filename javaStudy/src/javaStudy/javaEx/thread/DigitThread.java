package javaStudy.javaEx.thread;

public class DigitThread extends Thread{

	public void run() {
		for(int i = 0; i<= 30; i++) {
			System.out.printf("%s : %d%n",getName(), i);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	}
}
