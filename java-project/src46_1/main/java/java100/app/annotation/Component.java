package java100.app.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Retention(RetentionPolicy.RUNTIME)

@Retention(value = RetentionPolicy.RUNTIME)
public @interface Component {
	String value() default "";
}
