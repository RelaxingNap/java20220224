package chap02.lecture;

public class C05TypeDouble {
	public static void main(String[] args) {
		// 실수 float(4), double(8)
		// 특별한 이유 없으면 double로 쓸것
		double var1 = 3.14;	//
		//float var2 = 3.14;	// 실수 literal은 doubletype
		float var2 = 3.14F;	// float literal은 끝에 F(f)
		
		double var3 = 5E3;	//5 * 10^3
		double var4 = 5e3;	//5 * 10^3
		double var5 = 5e-3;	//5 * 10^-3
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}
}
