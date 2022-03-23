package chap11.book.example.s110801;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//첫번째 방법 : 전체 토큰수를 얻어 for문으로 루핑
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();	// 토큰수를 얻어오는 메소드
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); // 토큰값 넘겨줌
			System.out.println(token);
		}
		
		System.out.println();
		
		//두번째 방법 : 남아있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {	// 토큰이 남아있는지 확인하는 메소드
			String token = st.nextToken(); // 토큰값 넘겨줌
			System.out.println(token); 
		}
	}
}
