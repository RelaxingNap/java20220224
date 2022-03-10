package chap06.book.example.s060703;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String name, String ssn) {
		this.name = name;	//그냥 적을경우 파라미터변수를 가리키게 되어 제대로된 값이 안들어감.
							//동일한 이름일 경우 매개변수가 사용우선순위가 높기 때문
							//그래서 this를 적어야 함. this는 객체자신의 참조
		this.ssn = ssn;
	}
}
