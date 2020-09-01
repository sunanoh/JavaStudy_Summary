package javaStudy.exercise.doItJava.io.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			byte[] b = new byte[26];
			byte data = 65;
			
			for(int i = 0 ; i< b.length; i++) {
				b[i] = data;
				data++;
			}
			
			fos.write(b, 2, 10);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
