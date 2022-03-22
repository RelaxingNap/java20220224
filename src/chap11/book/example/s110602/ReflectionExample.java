package chap11.book.example.s110602;

import java.lang.reflect.*;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		
		//이런 클래스 정보들은 어노테이션(@)을 통해서 제공받아서 reflect클래스로 볼 수 있음
		
		Class clazz = Class.forName("chap06.book.example.s060705.Car");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		//생성자 이름과 매개변수정보를 출력
		System.out.println("[생성자 정보]");
		
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 필드 타입과 필드이름을 출력
		System.out.println("[필드 정보]");
		
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		// 메소드 이름과 매개변수를 출력
		System.out.println("[메소드 정보]");
		
		Method[] methods = clazz.getDeclaredMethods();
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName() + "(");
			Class[] parameters = methods[i].getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	private static void printParameters(Class[] parameters) {
		// 매개변수정보를 출력하는 공통코드 
		for(int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i < parameters.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
