package chap12.lecture.p01thread;

public class App08 {
	static int shareVar = 0;
	public static void main(String[] args) {
		// 공유하는 변수는 쓸려고 하지 말아라
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				System.out.println("Thread81 : " + shareVar);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				System.out.println("Thread82 : " + shareVar);
			}
		};
		
		t1.start();
		t2.start();
	}
}
