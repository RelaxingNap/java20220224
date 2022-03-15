package chap07.book.exercise.p05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		//부모클래스의 생성자에 매개변수를 넣은 생성자만 정의하여서 자식클래스에서는 자동으로 생성되지 않아 
		//부모클래스의 생성자인 super(name)을 명시적으로 선언해야 제대로 작동한다. 
		//this.name = name;
		super(name);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
}
