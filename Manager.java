public class Manager{
public static void main(String args[])
{
Department dept=new Department();
Employee emp=new Employee();
dept.display(12,"HR","subbu");
emp.show(13,"syamu",25000,"trainee",dept);
}
}