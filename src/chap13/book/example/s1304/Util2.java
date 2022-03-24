package chap13.book.example.s1304;

public class Util2 {
	public static <K, V>/*매개변수에 제네릭 타입이 쓰임을 명시*/ boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
	}
}
