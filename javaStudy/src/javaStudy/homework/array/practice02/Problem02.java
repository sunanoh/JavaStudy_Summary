package javaStudy.homework.array.practice02;

import java.util.Scanner;

//추가과제
//Practice 02
public class Problem02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		
		System.out.println("5개의 숫자를 입력하세요 : ");
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = scan.nextInt();	
			sum += num[i];
		}
		
		double average = sum/5;
		
		System.out.println("평균은 "+ average + " 입니다.");
		
		
	}

}
