package javaStudy.javaEx.thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DigitThread dt = new DigitThread();
		
		dt.setName("DigitThread");
		
		
		dt.start();
		
		
		try {
			dt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(char ch = 'A'; ch <= 'z'; ch ++) {
			System.out.println("MainThread : "+ ch);
			
			
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		
		}
	}

}
