package javaStudy.exercise.doItJava.thread;

import java.awt.Toolkit;

public class BeepTask extends Thread{
	
	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5 ; i ++) {
			toolkit.beep();
			System.out.println("띵소리"+ i);
			
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}
	
}
