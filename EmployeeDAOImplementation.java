package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import jdbc.Employee;

public class EmployeeDAOImplementation implements EmployeeDAO {
	Employee e=new Employee();
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);

	}

	public Employee getEmployee(int empId) {
		String query = "select * from employee where empId=" + empId;
		System.out.println("query:" + query);
		return (Employee) jdbcTemplate.queryForObject(query, new EmployeeRowMapper());
	}

	public class EmployeeRowMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
			Employee employee = new Employee();
			employee.setEmpId(resultSet.getInt("empId"));
			employee.setEmpName(resultSet.getString("empName"));
			employee.setEmpSalary(resultSet.getInt("empSalary"));
			return employee;
		}

	}

	public void addEmployee(Employee e) {
	
	
			
		String query1="insert into employee values(?,?,?)";
		
		int result = jdbcTemplate.update(query1, e.getEmpId(),e.getEmpName(),e.getEmpSalary());
		if(result==1){
			System.out.println("Record inserted Successfully");
		}
		else{
			System.out.println("some issue occured");
		}
		}
	

	public List<Employee> getEmployeeList() {
		String query2="select * from employee";
		
		return jdbcTemplate.query(query2,new EmployeeResultSetExtractor());
		
		
	}
	
	public class EmployeeResultSetExtractor implements ResultSetExtractor<List<Employee>>{

		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Employee> list=new ArrayList();
		while(rs.next()){
			Employee emp=new Employee();
			emp.setEmpId(rs.getInt("empId"));
			emp.setEmpName(rs.getString("empName"));
			emp.setEmpSalary(rs.getInt("empSalary"));
			list.add(emp);
			
		}
			
			return list;
		}
		
}

	public List<Employee> getMinAndMaxSalary() {
		String query3="select * from employee where empSalary between"+e.getMinEmpSalary()+"and"+e.getMaxEmpSalary();
		return jdbcTemplate.query(query3,new EmployeeResultSetExtractor());
		
		
		
	}
}
