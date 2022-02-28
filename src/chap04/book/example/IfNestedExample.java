package chap04.book.example;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = ((int)(Math.random() * 20) + 81);	// 점수 범위 : 81 ~ 100사이
		System.out.println("점수 : " + score);
		
		String grade;
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} 
		
		System.out.println("학점 : " + grade);
	}
}
