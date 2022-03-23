package chap11.book.exercise.p11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		// 어떨때는 true가 나오고 어떨때는 false가 나오는 경우가 발생하므로 
		// 정확하게 비교구분하기위해 equals메소드를 사용할 것
	}
}
