package chap06.lecture.p10singleton;

public class App01 {
	public static void main(String[] args) {
//		Manager m1 = new Manager();
//		Manager m2 = new Manager();
		// 생성자 여러개를 만드는 것을 원하지 않음.
		// 작성하는 코드패턴 중 하나인 싱글톤 패턴
		Manager m1 = Manager.getInstance();
		Manager m2 = Manager.getInstance();
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}
}
