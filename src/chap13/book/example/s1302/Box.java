package chap13.book.example.s1302;
//
//public class Box {
//	private Object object;
//	public void set(Object object) {
//		this.object = object;
//	}
//	
//	public Object get() {
//		return this.object;
//	}
//}

// 제네릭 타입으로 수정
public class Box<T> {
	private T object;

	public T get() {
		return object;
	}

	public void set(T object) {
		this.object = object;
	}
	
}
