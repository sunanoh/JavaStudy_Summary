package javaStudy.javaEx.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_buffered2.jpg";
	
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream(source);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream(target);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// read(byte[] b) : 매개값으로 주어진 바이트 배열의 길이만큼 바이트를 읽고 배열에 저장
			// 더이상 읽을 바이트가 없으면 -1 리턴
			// 읽은 수만큼 리턴
			
			byte[] data = new byte[10240];
			int size = 0;
			
			
			while((size = bis.read(data))!= -1) {
				bos.write(data);
				System.out.println(size + "바이트를 복사했습니다. ");
			}
			
			bis.close();
			bos.close();
			
			System.out.println("파일을 복사했습니다.");
			
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
