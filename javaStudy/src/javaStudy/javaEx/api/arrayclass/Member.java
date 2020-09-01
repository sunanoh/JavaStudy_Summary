package javaStudy.javaEx.api.arrayclass;

public class Member implements Comparable{

	private String name;
	
	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Member) {
			Member m = (Member)o;
			return name.compareTo(m.name);
		}
		return 0;
	}
	
	
}
