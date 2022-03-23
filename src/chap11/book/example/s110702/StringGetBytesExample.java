package chap11.book.example.s110702;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();	// 바이트배열로 변환.
										// 바이트 배열로 변환하는것을 인코딩한다고 함.
		System.out.println("bytes1.length : " + bytes1.length);
		
		String str1 = new String(bytes1); // 바이트 배열을 문자열로 변환하는것을 디코딩한하고 함.
		System.out.println("bytes1 -> String : " + str1);
		// 기본 문자셋으로 인코딩과 디코딩 
		// 이클립스 기본세팅을 UTF-8로세팅함.
		
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);
			// EUC-KR을 이용하여 인코딩 및 디코딩
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String : " + str3);
			// UTF-8을 이용하여 인코딩 및 디코딩
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
