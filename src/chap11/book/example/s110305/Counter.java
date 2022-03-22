package chap11.book.example.s110305;

public class Counter {
	private int no;

	Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객제의 finalize()가 실행됨");
	}
}
