package javaStudy.javaEx.generics;

public class Box <T> {
	
	T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}

}
