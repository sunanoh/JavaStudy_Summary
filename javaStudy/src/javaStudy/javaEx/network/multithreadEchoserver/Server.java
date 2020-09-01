package javaStudy.javaEx.network.multithreadEchoserver;

import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
	
		ServerSocket serverSocket = null;
		try {
			
		
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1",5001);
			
			serverSocket.bind(local);
			
			System.out.println("- 서버 시작 - ");
			System.out.println("- 접속 대기 중 - ");
			
			
			while(true) {
				Socket socket = serverSocket.accept();
				
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
