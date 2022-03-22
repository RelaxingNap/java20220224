package chap11.book.example.s110305;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 0; i <= 10; i++) {
			counter = new Counter(i);
		}
		
		counter = null;	// counter객체를 쓰레기로 만듬.
		
		System.gc(); // 쓰레기 수집기(garbage collector)실행요청
		//실행하면 메모리의 상태를 보고 일부만 무작위로 소멸
		//그래서 finalize()메소드의 호출시점이 명확하지 않음
		//프로그램이 종료될 때, 즉시 자원을 해제하거나, 즉시 데이터를 최종저장해야한다면,
		//일반메소드에서 작성하고 프로그램이 종료될때 명시적으로 메소드를 호출하는 것이 좋다.
	}
}
