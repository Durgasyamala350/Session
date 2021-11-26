public class Manager
{
 public static void main(String[] args)
 {
  
   
   Department dept = new Department(1,"HR","Subbu");
   Employee emp = new Employee(350,"Syamala",25000.50f,dept);
   System.out.println(emp);
}
}