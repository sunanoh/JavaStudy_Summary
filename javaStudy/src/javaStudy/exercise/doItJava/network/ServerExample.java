package javaStudy.exercise.doItJava.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
	
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); // 서버소켓이 억셉 하면, 그 억셉된 클라이언트의 소켓객체가 소켓으로 들어가고
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); // 그 클라이언트 소켓의 정보를 출력
				System.out.println("[연결 수락함] " + isa.getHostName());
			
				// 클라이언으로부터 데이터 받기---------------------
				
				String message = null;
				byte[] bytes = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				
				System.out.println("[클라이언트가 보낸 메시지] : " + message);
				
				// 데이터 보내기 ------------------------------
				OutputStream os = socket.getOutputStream();
				message = "안녕 클라이언트야? 메시지 받았어!";
				bytes = message.getBytes("UTF-8");
				
				os.write(bytes);
				os.flush();
				System.out.println("[클라이언트한테 답장보내기 성공!]");
				
				
				is.close();
				os.close();
				socket.close();
			
			
			
			}
					
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
