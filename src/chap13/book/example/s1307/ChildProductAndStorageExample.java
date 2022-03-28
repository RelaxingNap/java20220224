package chap13.book.example.s1307;

import chap13.book.example.s1303.Tv;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart TV");
		product.setCompany("SamSung");
		
		Storage<Tv> storage = new StorageImp1<Tv>(10);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}
