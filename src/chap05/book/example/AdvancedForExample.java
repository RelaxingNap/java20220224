package chap05.book.example;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {	// 배열안의 내용을 변수명으로 작성할 것 
			sum += score;
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = sum / (double) scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
