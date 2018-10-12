package CustomAnnotation;

import java.lang.reflect.Method;

public class Test {
	@MyAnnotation(developName = "Sekh", expirydate = "10-10-2018")
	public void myMethod1() {
		System.out.println("myMethod....");
	}

	@MyAnnotation(developName = "Mahadi", expirydate = "10-10-2019")
	@MyAnnotation2
	public void myMethod2() {
		System.out.println("myMethod2....");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		System.out.println("Welcome to annotation world!!");
		Method method = new Test().getClass().getMethod("myMethod1");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		System.out.println(annotation.developName() + "\t " + annotation.expirydate());
	}

}
