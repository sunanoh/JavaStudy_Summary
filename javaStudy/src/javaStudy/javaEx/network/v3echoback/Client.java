package javaStudy.javaEx.network.v3echoback;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
				System.out.println("전송할 메시지는 : " + message);
				
				
				String rcvMsg = br.readLine();
				System.out.println("수신한 메시지: "+ rcvMsg);
			}

			keyReader.close();
			br.close();
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
