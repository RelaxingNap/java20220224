package chap04.lecture.whileloop;

public class C02DoWhile {
	public static void main(String[] args) {
		
		System.out.println("stmt 1");
		do {
			System.out.println("stmt 2");
			System.out.println("stmt 3");
		} while(false);
		//종료조건에 관계없이 무조건 한번은 실행
		System.out.println("stmt 4");
	}
}
