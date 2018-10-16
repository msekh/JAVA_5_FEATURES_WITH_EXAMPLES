package GenericClassSingleParameterExample;

public class ClientTest {
	public static void main(String args[]) {
		MyGenericClass<String> class1 = new MyGenericClass<String>("Sekh");

		String obj = class1.getObject();
		System.out.println(obj);

		System.out.println("------------------------------");
		Employee em = new Employee();
		em.setId(1234);
		em.setName("Sekh");
		em.setSalary(12000.0);

		MyGenericClass<Employee> emp = new MyGenericClass<Employee>(em);
		Employee emp2 = emp.getObject();
		System.out.println(emp2);

	}
}
