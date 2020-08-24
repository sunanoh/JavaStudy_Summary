package javaStudy.exercise.doItJava.interfaceEx;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 5;
		
		ComleteCalc calc = new ComleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr= {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
