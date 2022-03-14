package chap06.lecture.p04method;

public class Calculator2 {
	
	//variable arguments (가변길이 매개변수)
	int sum(int... nums ) {	// 매개변수의 개수를 정해놓지 않고 여러개 받고 싶을때 작성. 배열처럼 사용
		System.out.println("nums의 길이 : " + nums.length);
		
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		
		return sum;
	}
	
	// 가변길이 매개변수는 항상 마지막에 작성
	int varSum(String name, int... nums) {
		
		
		return 0;
	}

	void concat(String... names) {
	
		for (String name : names) {
			System.out.print(name);
		}
		System.out.println();
	}
}
