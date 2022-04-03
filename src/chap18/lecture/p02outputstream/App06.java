package chap18.lecture.p02outputstream;

import java.io.*;

public class App06 {
	public static void main(String[] args) throws Exception{
		String in = "src/chap18/lecture/p02outputstream/App06.java";
		String out = "output/OutputStreamEx06.txt";
		
		InputStream is = new FileInputStream(in);
		OutputStream os = new FileOutputStream(out);
		
		byte[] datas = new byte[100];
		int len = 0;
		
		while((len = is.read(datas)) != -1) {
			os.write(datas, 0, len); // 다른 메소드를 쓰면 자투리부분이 그대로 나올 수 있는데,
									 // 이 메소드 사용하면 자투리 부분은 사용안해서 복사가 제대로 이루어짐.
		}
		
		os.close();
		is.close();
		
	}
}
