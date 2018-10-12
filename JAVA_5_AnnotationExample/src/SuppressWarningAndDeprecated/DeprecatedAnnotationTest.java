package SuppressWarningAndDeprecated;

public class DeprecatedAnnotationTest {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Addition add=new Addition();
	int  sum=add.sum(10, 20);
	System.out.println(sum);
	
	int []intArr= {10,20};
	int sum2=add.sum(intArr);
	System.out.println(sum2);
}
}
