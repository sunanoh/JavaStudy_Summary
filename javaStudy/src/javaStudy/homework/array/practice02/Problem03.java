package javaStudy.homework.array.practice02;


//추가과제
//Practice 03
public class Problem03 {

	public static void main(String[] args) {
		
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		for(int i = 0; i<c.length; i++)
			System.out.print(c[i]);
		
		System.out.println("");
		
		for(int i = 0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
				System.out.print(c[i]);
			}else {
			System.out.print(c[i]);	
			}
		}
			
		
	}

}
