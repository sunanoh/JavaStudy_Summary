package javaStudy.javaEx.thread.v2;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DigitThread dt = new DigitThread();
		dt.setName("DigitThread");
		
		dt.start();
		
		
		Thread ar = new Thread(new AlphabetRunnable());
		ar.start();
		
		dt.setPriority(Thread.MAX_PRIORITY);
		ar.setPriority(Thread.MIN_PRIORITY);
		
		
		
		try {
			dt.join();
			ar.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("종료 ");
	
	
	
	}

}
