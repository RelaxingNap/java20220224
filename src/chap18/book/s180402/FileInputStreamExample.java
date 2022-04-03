package chap18.book.s180402;

import java.io.*;

public class FileInputStreamExample {
	public static void main(String[] args) {
		
		try( InputStream is = new FileInputStream("src/chap18/book/s180402/FileInputStreamExample.java");) {
			int data;
			while((data = is.read()) != -1) {
				System.out.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
