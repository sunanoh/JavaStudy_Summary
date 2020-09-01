package javaStudy.exercise.doItJava.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터의 주소 : " + local);
			
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote: iaArr) {
				System.out.println("www.naver.com의  IP주소 : " + remote.getHostAddress());
			}
			
		
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
