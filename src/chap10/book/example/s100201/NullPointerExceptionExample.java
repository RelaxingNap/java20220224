package chap10.book.example.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		// null값을 갖는 참조변수로 객체 접근 연산자인 도트(.)를 사용할 때 발생
		// 객체가 없는데 객체를 사용하려고 했기 때문. 
		
		String data = null;
		System.out.println(data.toString());
	}
}
