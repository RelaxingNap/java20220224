package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
		
			
			try {
				FileReader fr = new FileReader("");
				fr.read();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
		
		
	}
}
