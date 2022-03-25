package chap11.book.example.s111103;

public class Member implements Comparable<Member>{
	String name;

	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
