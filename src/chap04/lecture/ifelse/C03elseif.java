package chap04.lecture.ifelse;

public class C03elseif {
	public static void main(String[] args) {
		System.out.println("statement 1");
		if(false) {	// false일때만 다음조건 확인
			System.out.println("statement 2");
	
		} else if(false) {
			System.out.println("statement 3");
			
		} else {	// 맨 마지막 else는 써도 되고 안써도 됨.
			System.out.println("statement 4");
		
		}
		//동시에 실행되는 경우 없고, 조건에 맞을때만 하나만 실행
		System.out.println("statement 5");
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
		System.out.println("statement 9");
		
	}
}
