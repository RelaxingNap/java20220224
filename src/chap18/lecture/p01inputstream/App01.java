package chap18.lecture.p01inputstream;

import java.io.*;

public class App01 {
	public static void main(String[] args) throws Exception {
		String fileName = "src/chap18/lecture/p01inputstream/App01.java";
		
		// IuputStream : 데이터 입력 처리 클래스
		InputStream is = new FileInputStream(fileName);
		
		// read() : 1byte 읽는 메소드
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		int byte4 = is.read();
		
		System.out.println(byte1); // p의 아스키코드출력
		System.out.println(byte2); // a의 아스키코드출력
		System.out.println(byte3); // c의 아스키코드출력
		System.out.println(byte4); // k의 아스키코드출력
	}
}
