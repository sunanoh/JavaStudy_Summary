package javaStudy.javaEx.io.charstream;

import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class CharStreamEx {
	
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "char.txt";

	public static void main(String[] args) {
		
		try {
			Writer fw = new FileWriter(filename);
			
			fw.write("첫 번째\n");
			fw.write("입력 해보기\n");
			fw.write("확인용\n");
			
			fw.flush();
			fw.close();
			
			Reader fr = new FileReader(filename);
			
			int data = 0;
			
			while((data = fr.read())!= -1 ) {
				System.out.print((char)data);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
