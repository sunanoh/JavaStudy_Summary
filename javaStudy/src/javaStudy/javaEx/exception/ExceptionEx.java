package javaStudy.javaEx.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// arithmeticException();
		//indexOutOfBoundEX();
		//nullPointExceptionEx();
		customException();
	}
	private static void customException() {
		ThrowExcept ex = new ThrowExcept();
		try {
			//ex.executeCheckedException();
			//ex.executeUncheckedException();
			System.out.println("10/0 = " + ex.divide(10, 0));
		//}//catch(IOException e) {
			//System.out.println("예외 메시지 : "+ e.getMessage());
		}catch(CustomArithmeticException e){
			System.out.println("사용자 정의 예외 메시지  : "+ e.getMessage());
			System.out.printf("예외상황 발생시 num1 = %d, num2 = %d%n", e.getNum1(), e.getNum2());
		}catch(RuntimeException e) {
			System.out.println("런타임 예외 메시지 : "+ e.getMessage());
		}
		
	}
	
	private static void nullPointExceptionEx() {
		String s = "Hello";
		
		s = null;
		
		try {
			System.out.println(s.toUpperCase());
		}catch(NullPointerException e) {
			System.out.println("예외 메시지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end of code");
	}
	
	
	private static void indexOutOfBoundEX(){
		int[] arr = new int[] {3,6,9};
		
		System.out.println("배열의 길이 : "+ arr.length);
		
		try {
			System.out.println(arr[3]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외 메시지 : "+e.getMessage());
		}
		System.out.println("End of code");
	}

	
	private static void arithmeticException() {
		Scanner scan = new Scanner(System.in);
		double result = 0;
		int num;
		
		System.out.println("정수를 입력하세요 : ");
		
		try {
			num = scan.nextInt();
			result = 100/num;
		}catch(ArithmeticException e) {
			System.out.println("예외 메세지 : "+e.getMessage());;
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력해 주세요!");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
			System.out.println("결과 : " + result);
			scan.close();
		}
	}

}
