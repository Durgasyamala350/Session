import java.util.*;
public class ReverseArr{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] arr= new int[5];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<arr.length; i++)  
{  
//reading array elements from the user   
arr[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<arr.length; i++)   
{  
System.out.println(arr[i]);  
}
System.out.println("reverse array");
for(int i=arr.length-1;i>=0;i--)
{
System.out.println(arr[i]);
}
  
}  
}