package javaStudy.exercise.doItJava.io.substream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("reader.txt");
			InputStreamReader isr = new InputStreamReader(is);
			
			int i;
			while((i = isr.read())!= -1) {
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
