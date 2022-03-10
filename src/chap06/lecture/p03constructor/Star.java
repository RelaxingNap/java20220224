package chap06.lecture.p03constructor;

public class Star {
	String stars;
	
	Star(int number) {
/*		String init = "";
		for(int i = 0; i < number; i++) {
			init += "*";
		}
		
		this.stars = init;
*/
		this("*",number);
		//다른생성자에서 중복되는 코드가 있을 시 this()를 사용.
	}
	
	Star(String shape, int number) {
		String init = "";
		for (int i = 0; i < number; i++) {
			init += shape;
		}
		this.stars = init;
	}
}
