package com.mtech.client;

import com.mtech.model.Employee;
import static com.mtech.util.ConstantsUtil.COMPANY_NAME;
import static java.lang.Math.sqrt;
public class ClientTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(10982);
		employee.setName("Sekh  mahadi");
		employee.setEmail("sekh36@gmail.com");
		
		//String companyName = ConstantsUtil.COMPANY_NAME;//before jdk 1.5 or java 5
		String companyName=COMPANY_NAME;//after JAVA 1.5 onwords
		employee.setCompanyName(companyName);
		
		System.out.println(employee);
		System.out.println("----------------");
        System.out.println(sqrt(25.0));
	}
}
