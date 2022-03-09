package chap05.lecture.string;

public class C06ReqEx {
	public static void main(String[] args) {
		
		
		// regular expression
		// 정규식(정규 표현식)
		// 문자열의 패턴을 표현한 문자
		
		// 한 문자
		System.out.println("a".matches("a"));
		System.out.println("b".matches("a"));
		System.out.println("aa".matches("a"));
		
		// 여러문자 중 하나
		System.out.println("a".matches("[abc]"));
		
		
		
		
	}
}
