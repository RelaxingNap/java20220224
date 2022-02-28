package chap04.lecture.switchcase;

public class C04Switch {
	public static void main(String[] args) {
		int i = 3;
		
		switch (i) {	// 가능
		case 1:
			
			break;

		default:
			break;
		}
		
//		double b = 3.14;	double형은 switch case문에서 지원하지 않는 자료형임
//		switch (b) {
//		case 1:
//			
//			break;
//
//		default:
//			break;
//		}
		String s = "a";		//가능
		switch (s) {
		case "b":
			
			break;

		default:
			break;
		}
	}
}
