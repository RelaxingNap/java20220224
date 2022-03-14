package chap06.book.exercise.p15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");	
		// ctrl + 1 누르면 클래스에 정의되지 않은 메소드를 자동으로 만들 수 있는 hint를 제공해 줌
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
