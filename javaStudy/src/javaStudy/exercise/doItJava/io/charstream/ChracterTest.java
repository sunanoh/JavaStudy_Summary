package javaStudy.exercise.doItJava.io.charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChracterTest {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("reader.txt");
			
			int i;
			while( (i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
