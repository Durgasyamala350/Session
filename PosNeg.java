import java.util.Scanner;
public class PosNeg
{
public static void main(String args[])
{
int no;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Integer number ");
no=scan.nextInt();
if(no>0)
{
System.out.println("Positive number");
}
else if(no<0)
{
System.out.println("negative number");
}
else
{
System.out.println("Zero");
}
}
}

