package javaStudy.exercise.doItJava.gamelevel;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	String a;
	final public void go(int count) {
		run();
		for(int i = 0 ; i <count ; i++) {
			jump();
		}
		turn();
	}
}
