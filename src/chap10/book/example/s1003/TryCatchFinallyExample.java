package chap10.book.example.s1003;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		//예외처리는 try-catch-finally 블록을 이용한다.
		//checked exception이라서 컴파일러가 체크해서 예외처리하기 쉽다.
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			//e.printStackTrace();
		}
	}
}
