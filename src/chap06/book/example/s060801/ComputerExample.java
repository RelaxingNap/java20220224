package chap06.book.example.s060801;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		//매개변수 표현방식은 다름.
		// sum1 : 매개변수에 배열이 들어가므로 배열표현으로 작성
		// sum2 : 매개변수에 변수여러개가 들어간다고 표현해서 여러변수를 ,로 구분하여 작성 할 수 있음. 
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);	
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + result4);
	}
}
