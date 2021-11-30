import java.util.*;
public class Count{
public static void main(String[] args){
int cnt=0;
String name;
Scanner s=new Scanner(System.in);
System.out.println("enter your name");
name=s.nextLine();
for(int i=0;i<name.length();i++){

cnt=cnt+1;
}
System.out.println("No of letters in the name is:"+cnt);
}
}