package javaStudy.homework.javaBasic.practice01_2;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// 더 간단한 방법 찾아보기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int sum = 0;

		
		for(int i = num; i >= 0 ; i-=2) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		
		
		System.out.println("\n결과 값은 : " + sum + "입니다.");
			
		scan.close();
	}

}


/*if(num % 2 == 0) {
	for(int i = 2 ; i <= num ; i+=2) {
		sum = sum + i;
		System.out.print(i + " ");
	}
}else {
	for(int i = 1 ; i <= num ; i+=2) {
		sum = sum + i;
		System.out.print(i + " ");
	}
}*/
