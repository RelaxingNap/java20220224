package chap06.lecture.p03constructor;

public class App03 {
	public static void main(String[] args) {
		Computer com1 = new Computer("intel", "16gb", "1tb");
		Computer com2 = new Computer("amd", "8gb");	
		//파라미터를 다르게 받아야 할 경우 생성자를 파라미터 개수에 맞게 따로 만들어야 함.
		
		com2.ssd = "2tb";
		
		
	}
}
