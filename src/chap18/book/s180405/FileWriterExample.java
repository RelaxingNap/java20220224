package chap18.book.s180405;

import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("output/temp.txt");
		//Writer wr = new FileWriter(file);  지정된 파일이 있을때 이 생성자 사용시 파일을 덮어써서 기존의 파일내용이 사라짐
		Writer wr = new FileWriter(file,true); // 따라서 기존의 파일내용끝에 데이터 추가시 생성자 두번째 값에 true를 주면 됨.
		
		wr.write("FileWriter는 한글로 된 " + "\r\n");
		wr.write("문자열을 바로 출력 할 수 있다." + "\r\n");
		
		wr.flush();
		wr.close();
		
	}
}
