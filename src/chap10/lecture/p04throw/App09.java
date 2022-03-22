package chap10.lecture.p04throw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App09 {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1( ) 
			throws Exception {	// 급한 경우에는 Exception을 일일이 나누어 처리 못하는경우 발생
								// 그래서 상위객체인 Exception을 던져서 처리하는 경우가 빈번함
		FileReader fr = new FileReader(""); // FileNotFoundException
		fr.read(); // IOException
	
		Class.forName("");	// ClassNotFoundException
		
	}
}
