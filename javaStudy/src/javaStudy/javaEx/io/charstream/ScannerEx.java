package javaStudy.javaEx.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;




public class ScannerEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
	
		File file = new File(filename);
		System.out.println(file.exists());
		
		try {
			
			Scanner scan = new Scanner(file);
			
			String name;
			float height;
			float weight;
			
			while(scan.hasNextLine()) {
				name = scan.next();
				height = scan.nextFloat();
				weight = scan.nextFloat();
				
				System.out.printf("%s, 키 : %f, 몸무게 : %f%n",name, height, weight);
				
				scan.nextLine();
			}
			
			scan.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
