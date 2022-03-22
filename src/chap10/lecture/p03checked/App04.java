package chap10.lecture.p03checked;

public class App04 {
	public static void main(String[] args) {
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ctrl + 1 에서 surrounded try/catch선택
	}
}
