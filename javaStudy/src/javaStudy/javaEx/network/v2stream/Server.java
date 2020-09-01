package javaStudy.javaEx.network.v2stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			
			//--------------------------------------------------
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String message;
			
			while((message = br.readLine())!= null){
				System.out.println("클라이언트로부터 수신한 메시지는? :" + message);
			}
			
			br.close();
			
			
			
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
