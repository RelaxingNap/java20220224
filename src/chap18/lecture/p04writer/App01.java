package chap18.lecture.p04writer;

import java.io.*;

public class App01 {
	public static void main(String[] args) throws Exception {
		// Writer : 문자단위 출력 스트림
		
		String path = "output/WriterEx01.txt";
		Writer wr = new FileWriter(path);
		
		wr.write('a');
		wr.write('z');
		wr.write('한'); // java에서는 2byte사용하지만 os나 파일 형식에따라 2byte가 아닐 수 있음.
		wr.write('글');
		wr.write('\n');
		wr.write("우크라이나");
		wr.write('\n');
		wr.write(new char[] {'자', '바' ,'스' ,'프' ,'링'});
		wr.write(8800);
		wr.write('\u2260');
		
		wr.close();
		System.out.println("종료!");
		
	}
}
