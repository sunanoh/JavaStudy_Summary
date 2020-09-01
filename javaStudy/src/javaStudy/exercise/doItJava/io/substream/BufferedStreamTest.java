package javaStudy.exercise.doItJava.io.substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		
		long milisecond = 0;
		
		try {
			FileInputStream fis = new FileInputStream("KakaoTalk_20170916_152924076.jpg");
			BufferedInputStream  bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("copy3.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			milisecond = System.currentTimeMillis();
			
			int i;
			
			while((i = bis.read())!= -1) {
				bos.write(i);
			}
		
			milisecond = System.currentTimeMillis() - milisecond;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일을 복사하는 데 "+ milisecond + "밀리세턴 소요되었습니다.");
	}
}
