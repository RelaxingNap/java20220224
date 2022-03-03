package chap04.lecture.breakcontinue;

public class C01Break {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;	//가장 가까운 반복문을 빠져나감				
			}
			System.out.println(i);
			
		}
	}
}
