package chap18.lecture.p01inputstream;

import java.io.*;
import java.util.Arrays;

public class App04 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p01inputstream/App04.java";
		
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[100];
		int len = 0; // 몇 바이트 읽었는지 저장할 변수
		int size = 0;
		while((len = is.read(datas)) != -1) {
			System.out.println(Arrays.toString(datas));
			size += len;
		}
		// 100byte의 공간을 다 사용하지 않을 경우. 이전에 읽었던 값이 남아있음. 
		// read() 메소드 사용시 남아있는 공간에 대해서 아무일도 하지 않음
		
		System.out.println(size);
	}
}
