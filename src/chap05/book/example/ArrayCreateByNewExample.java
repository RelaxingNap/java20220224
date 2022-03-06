package chap05.book.example;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		//배열의 인덱스 범위는 0 ~ (길이-1)이다.
		//만약 인덱스를 초과해서 사용하면 ArrayIndexOutOfBoundsException이 발생한다.
		
	}
}
