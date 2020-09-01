package javaStudy.javaEx.generics;

public class BoxApp {

	public static void main(String[] args) {
		
		Box<Integer> intBox = new Box<>();
		intBox.setContent(2020);
		
		int content = intBox.getContent();
		System.out.println(content);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("하이..");
		
		String content2 = strBox.getContent();
		System.out.println(content2);
		

	}

}
