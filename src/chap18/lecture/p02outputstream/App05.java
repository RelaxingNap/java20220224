package chap18.lecture.p02outputstream;

import java.io.*;

public class App05 {
	public static void main(String[] args) {
		String path = "output/OutputStreamEx05.txt";
				
		try (OutputStream os = new FileOutputStream(path);) {
			
			byte[] datas = { 3, 9, -120, 127, 99, 98, 12 };
			
			os.write(datas, 0, 3); // 3, 9, -120
			os.write(datas, 1, 4); // 9, -120, 127, 99
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("쓰기 종료");
		
		try(InputStream is = new FileInputStream(path);) {
			
//			System.out.println((byte) is.read());
//			System.out.println((byte) is.read());
//			System.out.println((byte) is.read());
//			System.out.println((byte) is.read());
//			System.out.println((byte) is.read());
//			System.out.println((byte) is.read());
//			System.out.println((byte) is.read());
			int data = 0;
			while((data = is.read()) != -1) {
				System.out.println((byte) data);
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("읽기 종료");
	}
}
