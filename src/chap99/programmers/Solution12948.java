package chap99.programmers;

import org.junit.jupiter.api.Test;

public class Solution12948 {
	
	@Test
	void test() {
		
		
	}
	
	
	
	public String solution(String phone_number) {
		String answer = "";

		answer = phone_number.substring(0, phone_number.length() - 4);
		answer.replaceAll("*", answer);
		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
	}
}
