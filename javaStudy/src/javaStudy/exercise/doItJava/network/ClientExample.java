package javaStudy.exercise.doItJava.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			// 연결요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			
			//-------- 데이터 전송
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "안녕 서버야? 난 클라이언트야~";
			bytes = message.getBytes("UTF-8");
			
			os.write(bytes);
			os.flush();
			
			System.out.println("데이터 보내기 성공! 서버가 받았을까?");
			
			//-------------서버로부터 데이터 받기
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[서버로 부터 데이터 받기 성공!, 받은 데이터는: "+message);

			os.close();
			is.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e) {}
		}
		
	}

}
