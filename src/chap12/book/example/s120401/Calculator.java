package chap12.book.example.s120401;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { 
		// 공유객체에서 값을 쓰는 메소드에 synchronized선언을 하거나 동기화 코드블록을 만들어서  
		// 한 쓰레드가 값을 쓰려고 하면 다른 쓰레드는 접근하지 못하게 해서 작업도중에 값이 바뀌지 않도록 함.
		
		//synchronized (this) {	 동기화 코드블록
			this.memory = memory;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		//}
		
		
	}
	
}
