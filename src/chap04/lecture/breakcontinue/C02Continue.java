package chap04.lecture.breakcontinue;

public class C02Continue {
	public static void main(String[] args) {
		System.out.println("stmt 1");

		for (int i = 0; i < 10; i++) {
			System.out.println("stmt 2");

			if (true) {
				continue; // 사용시 continue아래의 명령문은 실행하지 않고, 다음 증강식을 실행				
			}

			System.out.println("stmt 3");
		}

		System.out.println("stmt 4");
	}
}
