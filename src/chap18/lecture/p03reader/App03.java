// 한글

package chap18.lecture.p03reader;

import java.io.*;

public class App03 {
	public static void main(String[] args) throws Exception {
		String name = "src/chap18/lecture/p03reader/App03.java";
		
		// 문자 단위로 읽기
		Reader rd = new FileReader(name);
		
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		
		rd.close();
		
		// 바이트 단위로 읽기
		InputStream is = new FileInputStream(name);
		
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		// 한글을 제대로 읽어내지 못함.
		// 한글은 1byte로 구성된 문자가 아니기 때문에 이런 문제 발생
		
		is.close();
		
	}
}
