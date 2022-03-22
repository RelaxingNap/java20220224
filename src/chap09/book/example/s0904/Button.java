package chap09.book.example.s0904;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
