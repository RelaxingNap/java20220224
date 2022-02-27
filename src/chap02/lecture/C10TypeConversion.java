package chap02.lecture;

public class C10TypeConversion {

	public static void main(String[] args) {
		float f1 = 9000.123F;
		double d1 = 12000000000.1234;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2;
		double d2;
		
		f2 = f1;	//ok
		d2 = f1;	//ok
		
		System.out.println(f2);
		System.out.println(d2);
		
		f2 = (float) d1;	//not ok -> type casting. type casting되면 값을 잃어버릴 각오는 되어있어야함.
		d2 = d1;
	}

}
