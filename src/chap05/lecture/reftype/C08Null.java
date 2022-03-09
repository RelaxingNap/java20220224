package chap05.lecture.reftype;

public class C08Null {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";
		
		int[] a1 = new int[] {3, 4};
		int[] a2 = {5, 6};
		
		String s3 = null;	// 가리키는 인스턴스(객체)가 없음.
		String[] a3 = new String[3];
		System.out.println(a3[0]);
		System.out.println(a3[1]);
		System.out.println(a3[2]);
		
		// null인 참조변수 사용(주의)
		System.out.println(a3[0].equals("java")); //nullpointException 발생 이 뒤의 명령은 실행 안됨.
							
		
		System.out.println("프로그램 진행....");
	}
}
