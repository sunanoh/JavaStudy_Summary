package javaStudy.homework.javaBasic.practice01_2;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int total = 0;  // 잔고
		int deposit, withdraw;
		
		while(true) {
							
			System.out.println("---------------------------------");
			System.out.println("1. 예금  | 2. 출금  | 3. 잔고  | 4. 종료  ");
			System.out.println("---------------------------------");
			
			System.out.print("선택 > ");
			int menu = scan.nextInt();
			
			
			switch(menu) {
				case 1: 
					System.out.print("예금액 > ");
					deposit = scan.nextInt();
					total += deposit;
					break;
				case 2:
					System.out.print("출금액 > ");
					withdraw = scan.nextInt();
					total -= withdraw;
					break;
				case 3:
					System.out.println("잔고액 > " + total);
					break;
				case 4:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("다시 입력해주세요.");	
					break;
			}
			
			if(menu == 4)
				break;
		}
	}

}
