package javaStudy.exercise.doItJava.io.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("reader.txt");
			
			fw.write('A');
			fw.write("안녕하세요 왜안들어갸냐요?");
			
			fw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
