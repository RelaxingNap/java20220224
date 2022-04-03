package chap18.lecture.p05file;

import java.io.*;

public class App02 {
	public static void main(String[] args) {
		String path = "output/참조타입01_copy.png";
		File file1 = new File(path);
		
		System.out.println(file1.exists());
		file1.delete();	// 경로에 담긴 파일 삭제
		
		System.out.println(file1.exists());
		
		path = "output/other";
		File file2 = new File(path);
		
//		file2.mkdir(); // 폴더 하나 만들기
//		file2.delete(); // 폴더 삭제
		
		path = "output/other1/other2/other3";
		File file3 = new File(path);
//		file3.mkdirs(); // 여러 폴더 만들기
//		file3.delete();
	}
}
