package chap18.book.s180403;

import java.io.*;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "picture/참조타입07.png";
		
		String targetFileName = "output/참조타입07_copy.png";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		int readyByteNo;
		byte[] readBytes = new byte[100];
		
		while((readyByteNo = is.read()) != -1) {
			os.write(readBytes);
		}
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사 완료");
		
	}
}
