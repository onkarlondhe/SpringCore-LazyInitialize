package com.mzos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecuter {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp+"\t"+emp.hashCode());
		
		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println(emp1+"\t"+emp1.hashCode());
		
		context.close();
	}

}
