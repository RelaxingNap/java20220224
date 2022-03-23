package chap11.lecture.p03wrapper;

public class App07 {
	public static void main(String[] args) {
		// String을 기본타입(또는 wrapper class)로 변경
		// wrapper class의 static 메소드 parse...()
		// wrapper class의 static 메소드 valueof()

		String s1 = "365";
		
		int i1 = Integer.parseInt(s1);	// String을 기본타입 int로 변환
		Integer i2 = Integer.valueOf(s1); // String을 wrapper class인 Integer로 변환
		
		int i3 = Integer.valueOf(s1);	// auto unboxing되어서 가능
		Integer i4 = Integer.parseInt(s1); // auto boxing되어서 가능
		
	}
}
