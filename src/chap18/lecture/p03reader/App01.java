package chap18.lecture.p03reader;

import java.io.*;

public class App01 {
	public static void main(String[] args) throws Exception {
		// Reader : 문자 단위 입력 스트림
		
		String name = "src/chap18/lecture/p03reader/App01.java";
		
		Reader rd = new FileReader(name);
		
		int char1 = rd.read();	// p
		int char2 = rd.read();	// a
		int char3 = rd.read();	// c
		
		System.out.println((char) char1);
		System.out.println((char) char2);
		System.out.println((char) char3);
		rd.close();
	}
}
