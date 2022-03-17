package chap06.book.example.s061005;

public class SingletonExample {
	/*
	Singleton obj1 = new Singleton();	// 컴파일 에러 : private로 지정해서 외부에서 안보이게 함.
	Singleton obj2 = new Singleton();
	*/
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton객체 입니다.");
		} else {
			System.out.println("다른 singleton객체 입니다.");
		}
	}
}
