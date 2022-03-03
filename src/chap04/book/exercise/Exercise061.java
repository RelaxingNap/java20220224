package chap04.book.exercise;

public class Exercise061 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		*
//		**
//		***
//		****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		*****
//		****
//		***
//		**
//		*

		for (int i = 0; i < 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		*****
//		 ****
//		  ***
//		   **
//		    *	
		
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < (4 - i); k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		// *찍기에서 빈칸도 찍어낼 수 있다는것을 염두해 둘 것
	}
}
