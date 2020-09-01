package javaStudy.exercise.doItJava.io.standard;

import java.util.Scanner;

public class ScammerTest {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("직업 : ");
		String job = scan.nextLine();
		
		System.out.println("사번 : ");
		int num = scan.nextInt();
		
		System.out.println(name + " " + job +  " " + num);
		
	}
}
