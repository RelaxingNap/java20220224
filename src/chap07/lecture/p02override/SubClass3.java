package chap07.lecture.p02override;

public class SubClass3 extends SuperClass3 {
	public void subMethod1() {
		System.out.println("서브메소드1!");
		super.superMethod2();	// 재정의와 상관없이 부모클래스 접근가능. super로 가능.
		System.out.println("서브메소드1@");
		super.superMethod1();
		System.out.println("서브메소드1#");
//		super.superMethod3();	private 멤버 - 접근 불가
	}
}
