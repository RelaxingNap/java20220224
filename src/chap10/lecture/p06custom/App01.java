package chap10.lecture.p06custom;

public class App01 {
	public static void main(String[] args) {
		try {
			method1(200);
		} catch (ValueOutOfBoundsException e) {
			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	private static void method1(int value) throws ValueOutOfBoundsException {
		if(value > 100) {
			throw new ValueOutOfBoundsException("value : " + value);
		} // 사용자가 직접 메소드를 만들시
		
		System.out.println("실행흐름 이어감..,,,");
	}
}
