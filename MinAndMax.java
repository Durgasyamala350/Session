import java.util.*;
public class MinAndMax{
public static void main(String[] args){
int arr[]=new int[5];
arr[0]=34;
arr[1]=43;
arr[2]=21;
arr[3]=50;
arr[4]=65;
int max=arr[0],min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}

}
System.out.println(max);
for(int i=0;i<arr.length;i++){
if(arr[i]<min)
{
min=arr[i];
}
}

System.out.println(min);
}
}
