package BoundAndUnboundWildcard;

import java.util.ArrayList;
import java.util.List;

public class Employee {
private int id;
private String fn;
private String ln;
	
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFn() {
	return fn;
}

public void setFn(String fn) {
	this.fn = fn;
}

public String getLn() {
	return ln;
}

public void setLn(String ln) {
	this.ln = ln;
}

	public void printList(List<Object> list) {
		for(Object listItem: list) {
			System.out.println(listItem);
		}
	}
	
	public static void printListItem(List<?> list) {
		list.forEach((listItem) -> {
			System.out.println(listItem);
		});
	}
}
