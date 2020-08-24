package javaStudy.javaEx.oop.summary;

public class KungfuPanda extends Panda implements Kungfu{

	public KungfuPanda(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.println(name + ": 아뵤~");
		System.out.println("쿵푸판다 클래스의 쿵푸()");
	}

}
