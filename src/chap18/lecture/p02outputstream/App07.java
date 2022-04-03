package chap18.lecture.p02outputstream;

import java.io.*;


public class App07 {
	public static void main(String[] args) {
		String in = "picture/참조타입01.png";
		String out = "output/참조타입01_copy.png";
		
		try(InputStream is = new FileInputStream(in);
			OutputStream os = new FileOutputStream(out);) {
		
			byte[] data = new byte[10000];
			int len = 0;
			
			while((len = is.read(data)) != -1) {
				os.write(data, 0, len);
			}
			// 10000byte씩 담아서 옮기기 때문에 반복되는 횟수가 줄어듬.
			// flush()는 inputstream이나 outputstream사용시 버퍼에 data가 남아서 문제가 발생할 수 있으므로 
			// close()전에 flush()를 사용하여 inputstream이나 outputstream을 사용시 쓰레기 data를 사용하지 않도록 함.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
