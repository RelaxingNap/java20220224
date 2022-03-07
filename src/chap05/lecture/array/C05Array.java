package chap05.lecture.array;

public class C05Array {
	public static void main(String[] args) {
		int[] arr1 = {3, 5, 1};
		int[] arr2 = arr1;	// 참조값만 받아옴
		
		arr2[0] = 30;	// arr1이 가리키는 배열과 arr2가 가리키는 배열이 같아서 
						// arr2의 배열값을 변화시키면 arr1의 배열 값도 변화함
		System.out.println(arr1[0]);
		
	}

}
