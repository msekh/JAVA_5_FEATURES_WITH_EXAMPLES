package GenericClassMultipletypeParameterExam;

import GenericClassSingleParameterExample.Employee;

public class ClientTest {
public static void main(String args[]) {
	Department dp=new Department();
	dp.setId(1);
	dp.setName("IT");
	
	Employee em=new Employee();
	em.setId(1234);
	em.setName("Sekh");
	em.setSalary(12000.0);
	
	MyGenericClass<Department,Employee> myGenericsClass=new MyGenericClass<Department, Employee>(dp, em);
	Department dept=myGenericsClass.getT();
	
	System.out.println(dept);
	Employee emp=myGenericsClass.getU();
	System.out.println(emp);
}
}
