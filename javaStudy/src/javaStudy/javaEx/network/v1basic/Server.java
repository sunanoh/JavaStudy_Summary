package javaStudy.javaEx.network.v1basic;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		
		try {
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 5002);
			
			serverSocket.bind(local);
			
			System.out.println("[----서버 기동----]");
			System.out.println("[---연결 대기중---]");
			
			Socket socket = serverSocket.accept();
			
			
			InetSocketAddress client = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[클라이언트 연결 완료]");
			System.out.println("연결된 클라이언트 주소 : "+ client.getAddress()+ ", " +client.getPort());
			
			System.out.println("====================");
			System.out.println("[---서버 종료---]");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
