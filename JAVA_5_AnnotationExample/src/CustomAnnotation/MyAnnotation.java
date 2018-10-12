package CustomAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//user-defined or custom annotation 
@Documented
@Retention(RetentionPolicy.RUNTIME)//will br retained at runtime
public @interface MyAnnotation {
String developName() default "Sekh Mahadi";
String expirydate();
}
