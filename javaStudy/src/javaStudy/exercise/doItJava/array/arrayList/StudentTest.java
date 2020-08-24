package javaStudy.exercise.doItJava.array.arrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 90);
		lee.addSubject("수학", 100);

		lee.showStudentInfo();
	}

}
