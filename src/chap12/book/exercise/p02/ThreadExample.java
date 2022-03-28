package chap12.book.exercise.p02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		Thread thread3 = new Thread(() -> {
			for(int i = 0; i < 3; i++) {
				System.out.println("광고가 나옵니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread3.start();
	}
}
