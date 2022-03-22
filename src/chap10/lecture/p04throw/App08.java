package chap10.lecture.p04throw;


import java.io.FileReader;
import java.io.IOException;


public class App08 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

private static void method1() throws IOException {
	//FileNotFoundException은 IOException을 상속받고 있어서 따로 처리하지 않을거라면 IOException만 처리 하면 됨
	FileReader fr = new FileReader("");
	fr.read();
}
}
