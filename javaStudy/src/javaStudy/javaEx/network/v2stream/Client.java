package javaStudy.javaEx.network.v2stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("[--클라이언트 시작--]");
			System.out.println("[연결을 요청합니다.]");
			
			
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 5002);
			socket.connect(remote);
			
			System.out.println("[서버 연결 완료]");
			
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new  BufferedWriter(osw);
			
			String message = "안녕? 나는 클라이언트야~";
			bw.write(message);
			
			System.out.println("서버한테 보낸 메시지 : "+message);
			
			bw.close();
			
			
			
			
			
			System.out.println("[--클라이언트 종료--]");
			
		}catch(ConnectException e) {
			System.err.println("접속이 거부되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
