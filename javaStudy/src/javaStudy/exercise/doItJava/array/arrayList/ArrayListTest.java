package javaStudy.exercise.doItJava.array.arrayList;

import java.util.ArrayList;

import javaStudy.exercise.doItJava.array.Book;

// ArrayList 테스트
public class ArrayListTest {

	public static void main(String[] args) {
	
		ArrayList<Book> arr1 = new ArrayList<Book>();
		
		arr1.add(new Book("태백산맥", "조정래"));
		arr1.add(new Book("데미안", "헤르만 헤세"));
		arr1.add(new Book("어떻게 살 것인가", "유시민"));
		
		for(int i = 0; i < arr1.size(); i++) {
			Book book = arr1.get(i);
			book.showBookInfo();
		}
		
		System.out.println("=====================");
		
		
		
	}

}
