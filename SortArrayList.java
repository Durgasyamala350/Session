package Assignment;
import java.util.*;
public class SortArrayList {
	public static void main(String[] args)
	{
		List<Integer> values=new ArrayList<Integer>();
		values.add(40);
	    values.add(20);
	    values.add(35);
	    
	   Comparator<Integer> com = new CompImp();
	    Collections.sort(values,com);
	   
	    System.out.println(values);	
		
	}
}