package chap02.lecture;

public class C02Variable {
	public static void main(String[] args) {
		//변수의 사용범위(scope) : 선언된 블럭{} 안
		
		boolean b = true;
		int a = 10;
		
		if(b) {
		//	int a = 9;
			System.out.println(a);
		}
		
//		System.out.println(a);
	}
}
