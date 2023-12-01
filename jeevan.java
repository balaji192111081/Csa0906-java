import java.io.*;
import java.util.*;
class jeevan
{
public static void main(String args[])
{
int i,n,sum=0;
System.out.println("enter the n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i=i+1)
{
sum=sum+i;
}
System.out.println("sum of n natural numbers= "+sum);
}
}
