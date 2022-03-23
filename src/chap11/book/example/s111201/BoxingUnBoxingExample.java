package chap11.book.example.s111201;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100); //int를 생성자에 넣어서 Boxing
		Integer obj2 = new Integer("200"); //String을 생성자에 넣어서 Boxing
		Integer obj3 = Integer.valueOf("300"); //생성자를 이용하지 않고 valueOf를 이용하여 String을 Boxing
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
