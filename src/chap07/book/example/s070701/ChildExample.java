package chap07.book.example.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// 자동 타입 변환
		parent.method1();
		parent.method2();	// 재정의된 메소드(child class의 메소드)실행
//		parent.method3();	(parent class에 없는 메소드임. 호출 불가) 

	}

}
