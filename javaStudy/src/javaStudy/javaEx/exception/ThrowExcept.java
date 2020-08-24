package javaStudy.javaEx.exception;

import java.io.IOException;

public class ThrowExcept {

	public void executeCheckedException() throws IOException{
		
		System.out.println("체크드 예외 발생!");
		throw new IOException();
		// 강제로 예외 발생하는 메서드
	}
	
	
	public void executeUncheckedException() throws RuntimeException{
		System.out.println("언체크드 예외 발생!");
		throw new RuntimeException("강제 RuntimeException");
	}
	
	
	public double divide(int num1, int num2) {
		double result = 0;
		
		try {
			result = num1/num2;
		}catch(ArithmeticException e) {
			throw new CustomArithmeticException("사용자 정의 예외", num1, num2);
		}
		
		return result;
	}
}
