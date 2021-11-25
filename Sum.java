import java.util.*;
public class Sum{

public static void main(String[] args) {
int n, rem,sum= 0;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while (n != 0){
 rem = n % 10;
 sum= rem+sum;
 n= n/10;
 }
 System.out.println("sum of given number is "+sum);
}
}