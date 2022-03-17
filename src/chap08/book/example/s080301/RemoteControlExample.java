package chap08.book.example.s080301;

import chap08.book.example.s0802.*;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc1, rc2;
		rc1 = new Television();
		rc2 = new Audio();
		
		rc1.setVolume(11);
		rc2.setVolume(-1);
	}
	
}
