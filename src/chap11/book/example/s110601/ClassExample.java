package chap11.book.example.s110601;

import chap06.book.example.s060705.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
				
		try {
			Class clazz2 = Class.forName("chap06.book.example.s060705.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
