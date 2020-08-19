package javaStudy.homework.array.practice02;


//추가과제
//Practice 05
public class Problem05 {

	public static void main(String[] args) {

		int scoreboard[][] = {
								{80, 75, 90, 95, 78},
								{92, 88, 89, 92, 70},
								{78, 80, 85, 86, 63},
								{83, 84, 89, 87, 75},
								{89, 83, 93, 94, 78}
							};
		int sum = 0;
		int count = 0;
		
		System.out.println(scoreboard[3].length);
		System.out.println(scoreboard.length);
		
		for(int i = 0; i < scoreboard.length; i++) {
			for(int j = 0; j < scoreboard[i].length; j++){
				if(scoreboard[i][j] >= 85) {
					count++;
					sum += scoreboard[i][j];
				}
			}
		}
		
		
		
		System.out.println("85점 이상인 점수의 갯수: "+ count);
		System.out.println("85점 이상인 점수의 총합: "+ sum);
		System.out.println("85점 이상인 점수의 평균: "+ sum/count);
		
		
		
		}

	}


