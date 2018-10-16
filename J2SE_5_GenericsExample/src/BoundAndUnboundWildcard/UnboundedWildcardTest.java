package BoundAndUnboundWildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardTest {
	public static void main(String args[]) {
		Employee emp = new Employee();

		List<Object> list1 = new ArrayList<>();
		// Arraylist of Object type.
		list1.add("Sekh");
		list1.add("Mahadi");
		list1.add(101);

		// Arraylist of String type.
		List<String> list2 = new ArrayList<>();

		list2.add("Shekh");
		list2.add("Rupon");
		list2.add("Niaj");
		
		emp.printList(list1);
		emp.printListItem(list1);
		emp.printListItem(list2);
	}
}
