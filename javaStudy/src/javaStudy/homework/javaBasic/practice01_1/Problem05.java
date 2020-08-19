package javaStudy.homework.javaBasic.practice01_1;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.println("-----------------------------");
		
		int max = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if(max < num) {
				max = num;
			}
		}
		
		System.out.println("-----------------------------");
		System.out.println("최대값은 " + max + "입니다.");
				
		
	}

}
