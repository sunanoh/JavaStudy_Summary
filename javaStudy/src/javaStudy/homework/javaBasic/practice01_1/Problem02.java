package javaStudy.homework.javaBasic.practice01_1;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		for(int i = 1 ; i <= num; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
