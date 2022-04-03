package chap18.lecture.p03reader;

import java.io.*;
import java.util.Arrays;

public class App04 {
	public static void main(String[] args) throws Exception {
		
		String name = "src/chap18/lecture/p03reader/App04.java";
		
		Reader rd = new FileReader(name);
		// char[]로 여러문자 받아서 읽음.
		char[] datas = new char[10];
		
		rd.read(datas);
		System.out.println(Arrays.toString(datas));
		rd.read(datas);
		System.out.println(Arrays.toString(datas));
		
		rd.close();
	}
}
