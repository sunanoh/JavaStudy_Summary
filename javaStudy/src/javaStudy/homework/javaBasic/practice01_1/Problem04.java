package javaStudy.homework.javaBasic.practice01_1;


public class Problem04 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10  ; i++) {
			for(int j = i + 1; j <= 10 + i; j++) {
				System.out.print(j + "\t");
			}
			System.out.println("");
		}

	}

}
