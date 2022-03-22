package chap11.book.exercise.p04;

public class Member {
	private String id;
	private String name;
	
	Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}
	
	
}
