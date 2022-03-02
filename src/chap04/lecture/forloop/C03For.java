package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {	// i = index의 줄임말
			System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++) {	// i는 선언된 코드블럭 안에서만 사용가능. 밖에서 사용하고 싶을 시 선언을 밖에서 하면 됨.
			System.out.println(i);
		} 
	}
	
}
