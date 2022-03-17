package chap06.lecture.p10singleton;

public class Manager {
	
	private static Manager manager;
	
	// 생성자 여러개를 만드는 것을 원하지 않음. 접근하지 못하게 private로 막음.
	private Manager() {
		
	}
	
	public static Manager getInstance() {
		if(manager == null) {
			manager = new Manager();
		}
		
		return manager;
	}
}
