package chap13.book.example.s1305;

public class Util {
	public static <T extends Number>/*제네릭타입에 제한을 검*/ int compare(T t1, T t2) {
		// Number타입 이하의 타입들만 사용할 수 있는 메소드
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
