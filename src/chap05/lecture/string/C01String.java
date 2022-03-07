package chap05.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);	// 참조값을 비교.
		
		System.out.println(s1.equals(s2));	// 내용물 비교.
		
		String s3 = "java";	//String은 자주써서 new를 사용안해도 생성됨.
		String s4 = "java"; //new 사용 안할 시, 같은 값이 사용된다면 새로생성 안하고 있는값의 참조값가져와서 사용.
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4); 	// 참조값 비교(참)
		
		
	}
}
