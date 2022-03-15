package chap07.book.exercise.p06;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		//실행 순서
		//자식클래스 기본생성자 -> 자식클래스에 파라미터 들어간 생성자 -> 부모클래스 기본생성자 ->  
		//부모클래스에 파라미터 들어간 생성자 -> 부모클래스 기본생성자 -> 자식클래스 기본생성자 ->
		//자식클래스에 파라미터 들어간 생성자 -> 자식클래스 기본생성자
		
		//출력 순서
		//부모클래스에 파라미터 들어간 생성자 -> 부모클래스 기본생성자 -> 
		//자식클래스에 파라미터 들어간 생성자 -> 자식클래스 기본생성자
	}
}
