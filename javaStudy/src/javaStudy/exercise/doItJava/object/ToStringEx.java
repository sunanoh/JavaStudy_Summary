package javaStudy.exercise.doItJava.object;


class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b = (Book)obj;
			if(this.bookNumber == b.bookNumber) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return bookNumber;
	}
	
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book boo1 = new Book(200, "개미");
		Book boo2 = new Book(200, "개미");
		
		System.out.println(boo1==boo2);
		System.out.println(boo1.equals(boo2));
		System.out.println(boo1.hashCode());
		System.out.println(boo2.hashCode());
	}

}
