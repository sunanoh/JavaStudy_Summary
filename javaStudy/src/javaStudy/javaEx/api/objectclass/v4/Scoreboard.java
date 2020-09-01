package javaStudy.javaEx.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable{

	private int scores[];
	
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("복제를 지원하지 않음");
		}
		
		return clone;
	}
	

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	
}
