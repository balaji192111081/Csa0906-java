import java.io.*;
import java.util.*;
class fibonacci
{
public static void main(String args[])
{
int i,n,t1=0,t2=1,temp;
System.out.println("enter the n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println(t1);
System.out.println(t2);
for(i=3;i<=n;i=i+1)
{
temp=t1+t2;
t1=t2;
t2=temp;
System.out.println(temp);
}
}
}
