package com.mtech.client;

import com.mtech.model.Employee;
import com.mtech.util.ConstantsUtil;

public class ClientTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(10982);
		employee.setName("Sekh  mahadi");
		employee.setEmail("sekh36@gmail.com");
		String companyName = ConstantsUtil.COMPANY_NAME;
		employee.setCompanyName(companyName);
		
		System.out.println(employee);

	}
}
