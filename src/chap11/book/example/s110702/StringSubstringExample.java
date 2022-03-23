package chap11.book.example.s110702;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6); // ssn의 0번부터 5번까지의 문자를 잘라서 문자열로 저장 (시작과 끝을 적는 방법)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // ssn의 7번부터 끝까지 문자를 잘라서 문자열로 저장(끝까지이기 때문에 시작번호만 적음)
		System.out.println(secondNum);
	}
}
