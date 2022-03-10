package chap06.book.exercise.p14;

public class Member {

	String name;
	String id;
	String password;
	int age;
	//field기준으로 생성자를 만들어주는 메뉴가 이클립스에 존재
	//source -> generate Constructor
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}
