package chap02.book;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;		//가수 23비트로 표현 가능한 값이 아니어서 근사치로 변환되고, 이로인해 정밀도 손실이 발생
		num2 = (int) num3;		//원래 int값을 갖지 못함.
								//해결책 : 모든 int값을 실수타입으로 안전하게 변환시키는 double타입 사용.
		int result = num1 - num2;
		System.out.println(result);
	}
}
