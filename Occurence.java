import java.util.*;
class Occurence {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements");
int m=sc.nextInt();

int arr[]=new int[m];

int find;
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<m; i++)  
{  
//reading array elements from the user   
arr[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<m; i++)   
{  
System.out.println(arr[i]);  
}
System.out.println("enter thr value to search");
find=sc.nextInt();
   
 boolean found = false;
 int count=0;

    for (int n : arr) {
      if (n == find) {
        found = true;
        count=count+1;
        
      }
    }
    
    if(found)
{
 System.out.println(find + " is found."+count+"times");

}


      
else
{

      System.out.println(find + " is not found.");
}

  }
}
