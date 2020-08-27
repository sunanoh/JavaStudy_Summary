package javaStudy.javaEx.io.bytestream;

import java.io.File;
import java.io.IOException;




public class FileClassEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	
	
	public static void main(String[] args) {
		
		// 기존 폴더 확인 
		File root = new File(rootPath);
		
		printFileInfo(root);
		//-------------------------------
		
		// 디렉토리 내부에 파일 생성
		
		File file = new File(rootPath + "myfile.txt");
		
		if(!file.exists()) {
			
			
			try {
				file.createNewFile();
				System.out.println("파일 생성!");
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			
		printFileInfo(root);
		file.delete();
		
		printFileInfo(root);
		
	}
	
	private static void printFileInfo(File f) {
		if(f.isDirectory()) {
			
			System.out.println("Directory : " + f.getName());
			
			File[] files = f.listFiles();
			
			for(File file : files) {
				System.out.print(file.isDirectory()? "(d) " : "(f) ");
				System.out.println(file.getName() + " - " + file.length());
			}
		}
		else {
			System.out.println("File : " + f.getName());
		}
	}

}
