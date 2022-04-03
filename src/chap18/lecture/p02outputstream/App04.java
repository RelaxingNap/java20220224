package chap18.lecture.p02outputstream;

import java.io.*;

public class App04 {
	public static void main(String[] args) {
		String inputFile = "picture/다형성01.png";
		String outputFile = "output/다형성01.png";	// 파일 경로는 프로젝트기준
		
		try( InputStream is = new FileInputStream(inputFile);
			 OutputStream os = new FileOutputStream(outputFile);) {
			
			int data = 0;
			
			while((data = is.read()) != -1 ) {
				os.write(data);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
