public class Employee
{
	
	private int empId;
	private String empName;
	private double empSal;
	private Department empDept;
	
	public Employee(int empId,String empName,double empSal,Department empDept)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	public String toString()
	{
		return  "Id : "+empId+
				"\nName: "+empName+
				"\nSalary Rs: "+empSal+
				"\n"+empDept;
	}
	


}