package javaStudy.homework.array.practice02;


//추가과제
//Practice 04
public class Problem04 {

	public static void main(String[] args) {
	
		int[] rotto = new int[6]; 
				
		
		for(int i = 0 ; i < rotto.length ; i++){
			rotto[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i; j++) {
				if(rotto[i] == rotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 0; i < rotto.length ; i++ ) {
			System.out.print(rotto[i] + " ");
		}
		
		

	}

}
