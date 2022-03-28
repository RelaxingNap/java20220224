package chap05.book.example;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name() 메소드 : 열거 객체가 가지고 있는 문자열 리턴
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal() 메소드 : 전체 열거 객체중 몇번째 열거 객체인지 알려줌
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compareTo() 메소드 : 매개값으로 주어진 열거 객체를 기준으로 전후로 몇번째 위치하는지 비교
		//						열거 객체가 매개값의 열거 객체보다 순번이 빠르면 음수, 순번이 낮으면 양수가 리턴
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() 메소드 : 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 리턴함
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		}
		
		// values() : 열거타입의 모든 열거 객체들을 배열로 만들어 리턴
		Week[] days = Week.values();
		for (Week week : days) {
			System.out.println(week);
		}
	}
}
