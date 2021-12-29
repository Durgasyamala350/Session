package BankApplication;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;


	public class MainBank
	{
	  public static void main(String[] args)
	  {
		ApplicationContext context = new ClassPathXmlApplicationContext("BankContext.xml");
		User user =(User) context.getBean(User.class);
		System.out.println(user);
		AccountDetails accountDetails = (AccountDetails) context.getBean(AccountDetails.class);
		System.out.println(accountDetails);
	  }
	}


