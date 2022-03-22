package chap11.book.example.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);	// 원래는 이렇게 써야 되지만
		
		System.out.println(myPhone);// 이렇게 써도 되도록 System.out.println에서 myPhone.toString을 자동호출해서 리턴값 얻은 후 출력함
	}
}
