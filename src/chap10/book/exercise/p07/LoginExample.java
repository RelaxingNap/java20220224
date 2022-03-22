package chap10.book.exercise.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		// id가 "blue"가 아니라면 NotExistIDException 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("존재하지 않는 id입니다.");
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("잘못된 비밀번호입니다.");
		}
		
	}
	
	
}
