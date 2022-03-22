package chap06.lecture.p11annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnnotation7 {
	String[] value() default "hello";	// 타입을 배열로 작성하면 여러개의 값을 줄 수 있음.
	// default값을 설정하여 기본값을 설정할 수 있음
	// Api에서 Required로 적혀있는 Annotation은 반드시 element(attribute)값을 설정해야함
	
	int price() default 900;
}
