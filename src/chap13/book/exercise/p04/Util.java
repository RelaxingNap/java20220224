package chap13.book.exercise.p04;

public class Util {

//	public static <K,V> V getValue(Pair<K, V> pair, K k) {
//		K key = pair.getKey();
//		if(key.equals(k)) {
//			return pair.getValue();
//		}
//		
//		return null;
//	}
	
	public static <T extends Pair<K,V>, K, V> V getValue(T t, K k) {
		K key = t.getKey();
		if(key.equals(k)) {
			return t.getValue();
		}
		
		return null;
	}

	


}
