package chap05.book.exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 1 };
		arr1 = new int[] {99, 88};
		
		// {3, 2, 1}인스턴스는 언젠가 Garbage Collector(GC)에의해 자동으로 소멸된다.
		// C에서는 일일이 소멸시켜줬어야 했음.
	}
}
