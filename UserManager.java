
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class UserManager
{
  Scanner sc = new Scanner(System.in);
  User u1 = new User();
  Map obj = new HashMap();
// UserManager u2 = new UserManager();
  public void createNewUser() 
  {
	 
	for(int i=0;i<2;i++) {
		try {

	System.out.println("enter the user Id:");
	u1.userId = sc.nextInt();
	if(u1.userId==(obj.userId))
	  {
	     System.out.println(" user alreay exists:");
	  }
	System.out.println("enter the user Password:");
	u1.userPassword= sc.next();
	System.out.println("enter the user name: ");
	u1.userName = sc.next();
	System.out.println("enter the user Role: ");
	u1.userRole= sc.next();
	System.out.println("enter the user created date: ");
	u1.userCreation =sc.next();
	System.out.println("enter the is user active: ");
	u1.isUserActive= sc.nextBoolean();
		}
		catch(InputMismatchException e)
		{
			System.out.println(" please write input match data: ");
		}
		catch(UserAlreadyExistExceptioin ex)
		{
			System.err.println(ex.getMessage());
		}
//	obj.put(userId,createNewUser());
//	System.out.println(obj);
	
//	Map obj = new HashMap();
	obj.put("User ID",u1.userId);
	obj.put("userPassword",u1.userPassword);
	obj.put("userName",u1.userName);
	obj.put("userRole",u1.userRole);
	obj.put("userCreation",u1.userCreation);
	obj.put("isUserActive",u1.isUserActive);
	System.out.println(obj);
  }
  }	  
	
//  }
  public void printDetails()
  {
	  System.out.println(u1.userId+" "+u1.userPassword+" "+u1.userName+" "+u1.userRole
	  +" "+u1.userCreation+" "+u1.isUserActive);
  }
  public User getUserById()
  {
	 
	  System.out.println("enter the user id: ");
	  int userId1= sc.nextInt();
	  if(u1.userId==(userId1))
	  {
		  printDetails();
		  System.out.println("access allowed");
	  }
	return u1;  
  }
}