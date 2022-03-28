package chap12.book.example.s120202;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		// Thread 클래스 상속
		Thread thread = new BeepThread();
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
