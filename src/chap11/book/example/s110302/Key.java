package chap11.book.example.s110302;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;
			if(this.number == key.number) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
