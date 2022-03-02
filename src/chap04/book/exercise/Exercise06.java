package chap04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		String star = "*";	
		
		for (int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*";	//별을 추가하는 방법도 있음.
		}
		
		System.out.println("출력 (끝에 enter없이)");
		System.out.print("출력 1 ");
		System.out.print("출력 2 ");
		System.out.println(); 	// 그냥 다음 줄로 내려감
		System.out.print("출력 3 ");
		System.out.println(); 
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
