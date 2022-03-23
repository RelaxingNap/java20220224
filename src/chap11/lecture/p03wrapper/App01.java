package chap11.lecture.p03wrapper;

public class App01 {
	public static void main(String[] args) {
		// java data type
		// primitive type (8개) : byte, short, int, long, char, boolean, float, double
		// reference type (무한) : 나머지 모두
		
		Object[] arr = new Object[3];
		arr[0] = "java";
		arr[1] = 3;		// 기본타입은 Object를 상속받지 않아서 가능하지 않은데 에러없이 실행되고 있음.
						// java 5부터 가능
		arr[2] = new Integer(3);	// java 4버전이전에 쓰던방식
		
		// wrapper class (8개)
		// Byte, Short, Integer, Character, Long, Float, Boolean, Double
	}
}
