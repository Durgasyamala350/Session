package model;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAO;
import jdbc.Employee;

public class AppMain {
	public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
	EmployeeDAO employeeDAO=(EmployeeDAO) context.getBean("EmployeeDaoImplementation");
	
//	Employee emp=employeeDAO.getEmployee(1);
//	System.out.println(emp);
	Scanner sc=new Scanner(System.in);
	Employee emp1=new Employee();
	System.out.println("enter the minimum  salary of an Employee");
	emp1.setMinEmpSalary(sc.nextInt());
	System.out.println("enter the maximum  salary of an Employee");
	emp1.setMaxEmpSalary(sc.nextInt());
	
	
//	System.out.println("enter the employee details empId,empname,empsalary");
//	System.out.println("enter how many records3 you want to insert");
//	int n=sc.nextInt();
//	for(int i=0;i<n;i++){
//		System.out.println("enter empId");
//	 emp1.setEmpId(sc.nextInt());
//	 System.out.println("enter empName");
//	 emp1.setEmpName(sc.next());
//	 System.out.println("enter empsalary");
//	 emp1.setEmpSalary(sc.nextInt());
//
//	 employeeDAO.addEmployee(emp1);
//	 System.out.println(emp1);
//	List<Employee> result=employeeDAO.getEmployeeList();
//	System.out.println(result);
	List<Employee> result=employeeDAO.getMinAndMaxSalary();
	System.out.println(result);
	}
	

	

	
	
	
	}

