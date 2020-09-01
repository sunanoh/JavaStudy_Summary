package javaStudy.exercise.doItJava.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
	}

}
