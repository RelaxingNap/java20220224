package chap06.book.example.s061003;

public class Television {

	static String company = "Samsung";
	static String model = "lcd";
	static String info;
	
	static {
		info = company + "-" + model;
	}	// 정적필드 초기화는 정적블록에서

}
