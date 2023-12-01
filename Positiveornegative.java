import java.io.*;
import java.util.*;
class Positiveornegative
{
public static void main(String args[])
{
int a,r,n;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
r=-a+1;
n=r+a;
if(a>0)
{
System.out.println("positive number");
}
else
{
System.out.println("it is a negative number and add "+r+" to become positive");
System.out.println("new positive number is " +n);
}
}
}
