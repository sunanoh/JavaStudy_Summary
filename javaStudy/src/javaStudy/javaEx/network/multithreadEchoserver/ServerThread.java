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

public class ServerThread extends Thread {
	
	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket =socket;
	}

	@Override
	public void run() {
		
		try {
			
			InetSocketAddress client = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("클라이언트가 연결되었습니다.");
			System.out.println(client.getAddress() + " : " + client.getPort());
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			String message;
			
			while((message = br.readLine())!= null) {
				System.out.println("수신한 메시지 : " + message);
				
				System.out.println("Echo bakc : "+ message);
				bw.write(message);
				bw.newLine();
				bw.flush();
				
			}
			
			System.out.println("클라이언트 접속 해제");
			
			br.close();
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
