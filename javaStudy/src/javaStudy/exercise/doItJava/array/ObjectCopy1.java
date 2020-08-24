package javaStudy.exercise.doItJava.array;

// 얕은 복사
public class ObjectCopy1 {

	public static void main(String[] args) {
		
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("태백산맥", "조정래");
		arr1[1] = new Book("데미안", "헤르만 헤세");
		arr1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		System.out.println("===========arr2의 책===========");
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
