package chap12.book.example.s120201;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// Runnable interface 구현
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);

		// 람다식 이용		
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
