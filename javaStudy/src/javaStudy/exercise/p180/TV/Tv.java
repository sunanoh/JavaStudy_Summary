package javaStudy.exercise.p180.TV;


// 강의자료 p.180
public class Tv {
	
	private int channel;
	private int volume;
	private boolean power;
	
	// 생성자 ----------------------------------------------
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	// ---------------------------------------------------

	// Getter --------------------------------------------
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	// ---------------------------------------------------
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up == true)
			this.channel ++;
		else
			this.channel --;
	}
	
	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(up == true)
			this.volume ++;
		else
			this.volume --;
	}
	
	public void status() {
		System.out.printf("현재 채널 : %d번, 볼륨 : %d, 전원 상태 : %b%n", channel, volume, power);
	}
	
	
		
	
	
}
