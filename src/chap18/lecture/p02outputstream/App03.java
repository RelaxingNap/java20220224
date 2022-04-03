package chap18.lecture.p02outputstream;

import java.io.*;

public class App03 {
	public static void main(String[] args) {
		String inputFile = "src/chap18/lecture/p02outputstream/App03.java";
		String outputFile = "output/OutputStreamEx03.txt";
		
		try(
			InputStream is = new FileInputStream(inputFile);
			OutputStream os = new FileOutputStream(outputFile);) {
			
			int data = 0;
			
			while((data = is.read()) != -1) {	// data읽기 (1byte)
				os.write(data);					// data쓰기
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
