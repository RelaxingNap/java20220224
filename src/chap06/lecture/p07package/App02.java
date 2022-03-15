package chap06.lecture.p07package;

//import 키워드 : 파일 내에서 사용할 클래스를 작성하면 full name 중 package 생략 가능
import chap06.lecture.p03constructor.Computer;
//import 키워드 : *를 사용해서 패키지 내 모든 클래스 작성 가능
import chap06.lecture.p03constructor.*;

public class App02 {
	public static void main(String[] args) {
		chap06.lecture.p03constructor.Computer com1;
		Computer com2;	// import를 사용해서 어떤 package에있는 Computer클래스인지를 알고 있음
		Desk d1;
	}
}
