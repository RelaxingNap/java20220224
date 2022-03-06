package chap05.lecture.reftype;

public class C02ReferenceType {
	public static void main(String[] args) {
		String s1 = "hello";				// 많이 쓰이는 참조타입이라서 편의성을 갖춰서 이렇게 사용가능하게 함. 
		String s2 = new String("hello");	// 원래는 이렇게 쓰는게 맞음
		String s3 = new String("java");		
		
		System.out.println(s1 == s2);
		
	}
}
