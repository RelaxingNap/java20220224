package chap11.lecture.p03wrapper;

public class App08 {
	public static void main(String[] args) {
		Integer i1 = new Integer(9999);
		Integer i2 = new Integer(9999);
		
		int i3 = 9999;
		System.out.println(i1 == i2); // 참조값 비교 (가능한 사용 금지 => equals메소드 사용)
		System.out.println(i1 == i3); // true. auto unboxing
		
		Integer i4 = new Integer(8888);
		Integer i5 = new Integer(9999);
		
		System.out.println(i4 < i5); // true. auto unboxing
		
		// 비교 메소드
		// compareTo()
		// 결과는 int타입
		// 0, 음수, 양수 중 하나가 리턴
		// 0 : 같은경우
		// 음수 : 이 객체가 작으면
		// 양수 : 이 객체가 크면
		
		System.out.println(i4.compareTo(i5));
		System.out.println(i5.compareTo(i4));
	}
}
