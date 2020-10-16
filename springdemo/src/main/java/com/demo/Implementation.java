package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Implementation {
	public static void main(String[] args) {
		// container --> life cycle of the bean
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/demo1/spring-config.xml");
		Employee employee = (Employee) context.getBean("employee"); // new -- IOC
		employee.setEmployeeNumber(557);
		employee.setEmployeeName("Deeksha");
		employee.setSalary(20000);
		System.out.println("Employee Number: " + employee.getEmployeeNumber());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Employee Salary: " + employee.getSalary());

	}
}
