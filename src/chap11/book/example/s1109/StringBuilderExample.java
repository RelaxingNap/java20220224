package chap11.book.example.s1109;

public class StringBuilderExample {
	public static void main(String[] args) {
		// StringBuilder나 StringBuffer는 문자열을 저장해두고, 그 안에서 추가, 수정, 삭제작업을 할 수 있게 설계된 클래스이다.
		StringBuilder sb = new StringBuilder();	// StringBuilder객체 생성
		
		sb.append("Java ");
		sb.append("Program Study");	// 문자열을 끝에 추가

		System.out.println(sb.toString());
		
		sb.insert(4, "2"); // index 4번위치뒤에 2를 삽입. 2는 문자열임
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6'); // index 4번위치의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); // index 6번부터 index 13번 전까지를 "Book"문자열로 변환
		System.out.println(sb.toString());
		
		sb.delete(4, 5); // index 4번부터 5번전까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length(); // 총 문자수 얻기
		System.out.println("총 문자수 : " + length);
		
		String result = sb.toString(); // 버퍼에 있는것을 String타입으로 리턴
		System.out.println(result);
		
	}
}
