package javaStudy.javaEx.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "sangbuk.txt";
	
	
	public static void main(String[] args) {

		try {
			
			Reader r = new FileReader(filename);
			BufferedReader br = new BufferedReader(r);
			
			String string;
			
			
			while((string = br.readLine())!= null) {
				
				StringTokenizer st = new StringTokenizer(string, ",");
				
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println("");
			}
			
			
			br.close();
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
