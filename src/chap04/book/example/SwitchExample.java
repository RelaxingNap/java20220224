package chap04.book.example;

public class SwitchExample {
	public static void main(String[] args) {
		int num = ((int) (Math.random()*6) + 1);
		
		switch (num) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break;	// 다음번의 case문이 실행 안되고 빠져나가기 위해서 사용
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 : 
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break;
		default : 
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
	}
}
