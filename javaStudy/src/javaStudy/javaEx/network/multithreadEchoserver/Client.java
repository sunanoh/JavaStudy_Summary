package javaStudy.javaEx.network.multithreadEchoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		try {	
			Socket socket = new Socket();
			
			System.out.println("클라이언트 시작");
			System.out.println("연결을 요청하였습니다.");
			
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 5001);
			socket.connect(remote);
			
			System.out.println("서버에 연결되었습니다.");
			
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String message = keyReader.readLine();
				
				if(message.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				
				bw.write(message);
				bw.newLine();
				bw.flush();
				System.out.println("전송할 메시지 : " + message);
				
				
				String rcvMsg = br.readLine();
				System.out.println("수신한 메세지 : " + rcvMsg);
			}
			
			
			System.out.println("클라이언트 종료");
			keyReader.close();
			bw.close();
			br.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	

	}

}
