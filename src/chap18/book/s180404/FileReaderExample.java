package chap18.book.s180404;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		
		Reader rd = new FileReader("src/chap18/book/s180404/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = rd.read(cbuf)) != -1) {
			String data = new String(cbuf,0,readCharNo);
			
			System.out.print(data);
		}
		
		rd.close();
	}
}
