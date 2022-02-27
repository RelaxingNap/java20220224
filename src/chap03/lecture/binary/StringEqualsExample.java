package chap03.lecture.binary;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");	//생성자 사용해서 새로운 객체를 만들어 냄 
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3); // strVar1,strVar2은 같은 주소를 참조하지만, strVar3은 참조하는 주소값이 다름. 그래서 false
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
