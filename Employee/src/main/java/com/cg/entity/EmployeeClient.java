package com.cg.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = (Employee) factory.getBean("employee");
		/*System.out.println("Employee Details");
		System.out.println("------------------------------");
		System.out.println("EmployeeId:"+employee.getAge());
		System.out.println("EmployeeName:"+employee.getEmployeeName());
		System.out.println("EmployeeSalary:"+employee.getSalary());
		System.out.println("Employee BU:"+employee.getBussinessUnit());
		System.out.println("Employee Age:"+employee.getAge());*/
		System.out.println(employee);
	}

}
