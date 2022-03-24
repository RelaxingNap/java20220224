package chap13.book.example.s1305;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); (X)
		//String은 Number타입이 아님.
		
		int result1 = Util.compare(10, 20);//자동 boxing일어남.
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);//자동 boxing일어남.
		System.out.println(result2);
	}
}
