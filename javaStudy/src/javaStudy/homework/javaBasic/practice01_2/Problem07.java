package javaStudy.homework.javaBasic.practice01_2;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			
			int ranNum = (int)(Math.random()*100) + 1;
			
			System.out.println("================================");
			System.out.println("\t[숫자맞추기게임 시작]\t");
			System.out.println("================================");
				
			while(true) {
				System.out.print(">> ");
				int inputNum = scan.nextInt();
					
				if(inputNum > ranNum){
					System.out.println("Down!");
					continue;
				}
				else if(inputNum < ranNum) {
					System.out.println("Up!");
					continue;
				}			
				else if(inputNum == ranNum) {
					System.out.println("정답!");
					break;
				}
			}
				
			System.out.print("게임을 종료하시겠습니까? (Y/N) >> ");
			String check = scan.next();
				
			if(check.equals("Y")) {
				break;
			}else if(check.equals("N")) {
				continue;
			}
		}
		
		 System.out.println("================================");
		 System.out.println("\t[숫자맞추기게임 종료]\t");
		 System.out.println("================================");

	}
}