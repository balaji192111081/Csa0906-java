import java.io.*;
import java.util.*;
class Oddoreven
{
public static void main(String args[])
{
int a;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%2==0)
{
System.out.println("even number");
}
else
{
System.out.println("it is a odd number and need to add 1 to become even");
}
}
}
