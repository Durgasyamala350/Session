import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Future {
public static void main(String[] args)
{
	
	Date date1=null;
    Scanner input = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Enter check-in date (dd/MM/yyyy):");
    String cinput = input.nextLine();
    if(null != cinput && cinput.trim().length() > 0){
         try {
			date1 = format.parse(cinput);
		} catch (ParseException e) {
			
			
		}
    }
    
    System.out.print(date1); 


Date currentDate = new Date();
System.out.println(currentDate);

if(date1.after(currentDate)){
System.out.println(" future Date ");
}

else {
System.out.println("past date ");
}
}
}