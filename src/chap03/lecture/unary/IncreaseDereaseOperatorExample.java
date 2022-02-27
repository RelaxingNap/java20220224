package chap03.lecture.unary;

public class IncreaseDereaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("----------------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("----------------------------");
		z = x++;
		System.out.println("z = " + z);	//연산전에 대입되서 12출력
		System.out.println("x = " + x); //연산이 된 상태라서 13출력
		
		
		System.out.println("----------------------------");
		z = ++x;
		System.out.println("z = " + z);	//연산 후에 대입되서 14출력
		System.out.println("x = " + x); //연산이 된 상태라서 14출력
		
		System.out.println("----------------------------");
		z = ++x + y++;
		System.out.println("z = " + z);	//x는 ++연산 후의 값인 15인 상태이고, y는 ++연산전인 8인 상태에서 +연산이 실행됨.
										//그래서 z는 23출력
		System.out.println("x = " + x);
		System.out.println("y = " + y); //+ 연산 후 ++연산 진행되어서 값이 9임.
		
		
	}
}
