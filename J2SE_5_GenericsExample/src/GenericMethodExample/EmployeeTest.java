package GenericMethodExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
public static void main(String args[]) {
	Employee emp=new Employee(101, "Sekh", 10000.0);
	Employee emp1=new Employee(102, "mahadi", 15000.00);
	
	List<Employee> aList=new ArrayList<>();	
	aList.add(emp);
	aList.add(emp1);
	System.out.println("After passing List: ");
	//Passing List 
	employeeDetails(aList);
	
	Employee []empArr=new Employee[2];
	empArr[0]=emp;
	empArr[1]=emp1;
	System.out.println("After passung array: ");
	//Passing array as argument
	employeeDetails(empArr);
	System.out.println("After passing A single value:");
	//passing a single value object
	employeeDetails(emp);
	
}
public static <E> void employeeDetails(List<E> elements) {
	for(E e: elements) {
		System.out.println(e);
	}
}
public static <E> void employeeDetails(E[] elements) {
	for(E e: elements) {
		System.out.println(e);
	}
}
public static <E> void employeeDetails(E elements) {
	System.out.println(elements);
	}
}

