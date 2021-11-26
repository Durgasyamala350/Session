public class Department
{
  
	private int deptId;
	private String deptName;
	private String deptHead;
	
	public Department(int deptId, String deptName,String deptHead)
	{
	  this.deptId=deptId;
	  this.deptName=deptName;
	  this.deptHead=deptHead;
	}
	public String toString()
	{
		return "DepartId: "+deptId+
				"\nDepartmentName: "+deptName+
				"\nDepartmentHead: "+deptHead+"";
	}
}