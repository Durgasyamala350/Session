package jdbc;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private int minEmpSalary;
	private int maxEmpSalary;
	
	
	public Employee(int empId, String empName, int empSalary, int minEmpSalary, int maxEmpSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.minEmpSalary = minEmpSalary;
		this.maxEmpSalary = maxEmpSalary;
	}
	


	public Employee() {
		super();
	}



	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	public int getMinEmpSalary() {
		return minEmpSalary;
	}


	public void setMinEmpSalary(int minEmpSalary) {
		this.minEmpSalary = minEmpSalary;
	}


	public int getMaxEmpSalary() {
		return maxEmpSalary;
	}


	public void setMaxEmpSalary(int maxEmpSalary) {
		this.maxEmpSalary = maxEmpSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", minEmpSalary="
				+ minEmpSalary + ", maxEmpSalary=" + maxEmpSalary + "]";
	}

}