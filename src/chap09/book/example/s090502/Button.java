package chap09.book.example.s090502;

public class Button {
	OnClickListener listener;	// 인터페이스타입 필드
	
	void setOnClickListener(OnClickListener listener) {	// 매개변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();	// 구현객체의 onClick()메소드 호출
	}
	
	
	interface OnClickListener {
		void onClick();	// 중첩 인터페이스
	}
}
