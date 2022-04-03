package chap18.lecture.p02outputstream;

import java.io.*;

public class App01 {
	public static void main(String[] args) {
		// OutputStream : byte단위 출력할 때 사용하는 클래스
		String fileName = "output/OutputStreamEx01.txt";
		
		try(OutputStream os = new FileOutputStream(fileName);){
			os.write(99); // 1 byte 쓰기. int는 4byte. 3byte는 안씀.
			os.write(99999999); // 1byte 쓰기.
			os.write(9123131); // 1byte 쓰기.
			
			// file -> property에서 파일크기를 보면 3byte임을 파악 할 수 있다.
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료....");
	}
}
