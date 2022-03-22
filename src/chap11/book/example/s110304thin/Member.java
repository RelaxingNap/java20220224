package chap11.book.example.s110304thin;

public class Member implements Cloneable {	// 복제할 수 있음을 implement를 통해 표시
											// java.lang.Cloneable임
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	// clone 메소드의 리턴타입은 object이므로 Member타입으로 강제 형변환 필요
		} catch(CloneNotSupportedException e) { // 복제지원안하는경우의 예외처리 (checked exception)
		}
		return cloned;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", adult=" + adult
				+ "]";
	}
	
	
}
