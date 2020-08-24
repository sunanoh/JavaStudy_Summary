package javaStudy.exercise.doItJava.array;

// 깊은 복사
public class ObjectCopy2 {

	public static void main(String[] args) {
		// 복사할 배열에 인스턴스를 따로 생성한 후 요소 값을 복사함.
		
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("태백산맥", "조정래");
		arr1[1] = new Book("데미안", "헤르만 헤세");
		arr1[2] = new Book("어떻게 살 것인가", "유시민");
		
		arr2[0] = new Book();
		arr2[1] = new Book();
		arr2[2] = new Book();
		
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr2[i].setBookName(arr1[i].getBookName());
			arr2[i].setAuthor(arr1[i].getAuthor());
		}
		
		System.out.println("===========복사후 arr2===========");
		for(int i = 0; i < arr2.length;i++) {
			arr2[i].showBookInfo();
		}
		
		
		arr1[0].setBookName("나목");
		arr1[1].setAuthor("박완서");
		
		System.out.println("===========수정후 arr1의 책===========");
		for(int i = 0; i < arr1.length;i++) {
			arr1[i].showBookInfo();
		}
		System.out.println("===========수정후 arr2의 책===========");
		for(int i = 0; i < arr2.length;i++) {
			arr2[i].showBookInfo();
		}
		
		
	}

}
