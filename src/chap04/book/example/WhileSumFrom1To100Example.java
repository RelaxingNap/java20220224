package chap04.book.example;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		
		int sum = 0;
		
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		//while문이 끝났을 때 i의 값은 101이 되어있음.
		System.out.println("1 ~ " + (i - 1) + "까지 합 : " + sum);
	}

}
