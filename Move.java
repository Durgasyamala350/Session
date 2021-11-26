import java.util.*;
class Move {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements");
int m=sc.nextInt();
int i=0,j=0,temp;

int arr[]=new int[m];


System.out.println("Enter the elements of the array: ");  
for(i=0; i<m; i++)  
{  
//reading array elements from the user   
arr[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (i=0; i<m; i++)   
{  
System.out.println(arr[i]);  
}


if (arr[i]<0)
{
if(i!=j)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
j++;


System.out.println(arr[i]);
}
}
