package javaStudy.javaEx.thread.v2;

public class AlphabetRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(char ch = 'A'; ch <= 'Z' ; ch++) {
			System.out.println("AlphabetRunnable : " + ch);
		}
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
