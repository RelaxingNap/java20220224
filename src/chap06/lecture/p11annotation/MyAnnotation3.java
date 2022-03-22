package chap06.lecture.p11annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)	// annotation을 붙일 수 있는곳 지정
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {

}
