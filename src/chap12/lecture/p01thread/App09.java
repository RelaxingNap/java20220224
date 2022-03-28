package chap12.lecture.p01thread;

import java.util.concurrent.atomic.AtomicInteger;

public class App09 {
	static AtomicInteger shareVar = new AtomicInteger(0);
	public static void main(String[] args) {
		// 공유하는 변수는 쓸려고 하지 말아라
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar.incrementAndGet();
				}
				System.out.println("Thread91 : " + shareVar.get());
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					shareVar.incrementAndGet();
				}
				System.out.println("Thread92 : " + shareVar.get());
			}
		};
		
		t1.start();
		t2.start();
	}
}
