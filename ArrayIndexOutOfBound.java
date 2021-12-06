ackage Tasks;
import java.util.*;

public class ArrayIndexOutOfBound {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		try
		{
			for(int i=0;i<=array.length;i++)
			{
				System.out.println(array[i]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index is out of range ");
		}
	}

}
