package chap04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int a = 0;	//초기화 시키고 while문 실행시킴
		int b = 0;
		
		while((a + b) != 5) {
			a = (int) (Math.random()*6) + 1;
			b = (int) (Math.random()*6) + 1;
			System.out.println("( "+ a + " , " + b + " )");
		}
	}
}
