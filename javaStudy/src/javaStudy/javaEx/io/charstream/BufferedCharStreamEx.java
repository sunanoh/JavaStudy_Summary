package javaStudy.javaEx.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharStreamEx {

	
	// leaf텍스트 파일에서 leaves나 leaf있는 문자들 따로 뺴서 저장하기
	
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "last-leaf.txt";
	static String filtered = rootPath + "last-leaf-filtered.txt";
		
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(filtered);
			BufferedWriter  bw= new BufferedWriter(fw);
			
			
			String line = null;
			
			
			while((line = br.readLine())!= null){
				
				if(line.toLowerCase().contains("leaf") || line.toUpperCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
			}
			
			br.close();
			bw.close();

			
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
