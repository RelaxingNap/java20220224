package chap03.book.example;

public class CharOperatorExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;	// 65라는 유니코드에 1을 더한 값이므로 유니코드66'B'가 c1에 대입되게 된다.
		char c2 = 'A';
		// char c3 = c2 + 1; //컴파일 에러 
							 //한글자인 c2와 숫자1과의 연산이 이루어지기때문에 int형으로 변환되어 c3에 대입할 수 없음
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		//System.out.println("c3 : " + c3);
	}
}
