package SuppressWarningAndDeprecated;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningTest {
@SuppressWarnings({"unchecked","deprecation","rawtypes"})
public static void main(String []args) {
	Addition add=new Addition();
	//@SuppressWarnings("deprecation")
	int  sum=add.sum(10, 20);
	System.out.println(sum);
	
	//@SuppressWarnings("rawtypes")
	List list=new ArrayList();
	
	list.add(12);
	list.add(120);
	System.out.println(list);
}
}
