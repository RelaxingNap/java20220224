package chap18.lecture.p01inputstream;

import java.io.*;

public class App02 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p01inputstream/App02.java";
		
		InputStream is = new FileInputStream(path);
		
		// 더 이상 읽을 수 없다면 read()가 -1을 리턴
		
		int read = 0;
		int cnt = 0;
		while((read = is.read()) != -1) {
//			System.out.println(read);
			cnt++;
		}
		System.out.println(cnt);// 바이트 만큼 카운트
		
		
		
	}
}
