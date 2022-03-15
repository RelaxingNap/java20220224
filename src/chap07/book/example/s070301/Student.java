package chap07.book.example.s070301;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	
		//매개변수를 넣은 부모클래스의 생성자만 존재시 
		//자식클래스는 부모클래스의 생성자를 super()에 매개변수를 넣어서 명시적으로 코드를 작성해야함.
		this.studentNo = studentNo;
	}
}
