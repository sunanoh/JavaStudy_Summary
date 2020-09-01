package javaStudy.javaEx.thread.synchronize;

public class SharedMemory {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	
	public  void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() +":" + this.memory);
	}
}
