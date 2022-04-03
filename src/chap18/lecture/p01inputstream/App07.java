package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App07 {
	public static void main(String[] args) {

		// Exception

		String path = "picture/다형성01.png";
		// try - with - resource
		
		try ( // try block에서 사용하고 꼭 닫아야(close)하는 객체 선언/초기화 코드 작성
			  // 여기서 선언된 타입은 AutoCloseable 타입이어야 함.
			  // 여기서 선언된 내용들은 자동으로 close()를 실행 시켜줌.	
				InputStream	is = new FileInputStream(path);	
			) {

			byte[] datas = new byte[100];
			int len = 0;
			int size = 0;

			while ((len = is.read(datas)) != -1) {
				System.out.println(Arrays.toString(datas));
				size += len;
			}
			System.out.println(size);

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}
