package dao;

import java.util.List;

import javax.sql.DataSource;

import jdbc.Employee;

public interface EmployeeDAO {
	public void setDataSource(DataSource ds);
	public Employee getEmployee(int empId);
	public void addEmployee(Employee e);//adding new employee details to database
    public List<Employee> getEmployeeList();
    public List<Employee> getMinAndMaxSalary();
}
