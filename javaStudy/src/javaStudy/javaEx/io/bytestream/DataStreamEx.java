package javaStudy.javaEx.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "primitive.txt";
	
	public static void main(String[] args) {
	
		try {
			
			OutputStream os = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(os);
			
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			
			dos.close();
			
			InputStream is = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(is);
			
			String s = dis.readUTF();
			
			System.out.println(s);
			
			Boolean b = dis.readBoolean();
			
			System.out.println(b);
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
		
	}

}
