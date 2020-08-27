package javaStudy.javaEx.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {

		byte[] inSrc = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		System.out.println("입력 소스 :  " + Arrays.toString(inSrc));
		
		try {
			
			
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0;
			

			
			while((data = bis.read())!= -1) {
				System.out.println(data);
				bos.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			
			System.out.println(Arrays.toString(outSrc));
			
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	

	}

}
