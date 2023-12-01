import java.io.*;
import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int n,sum=0,temp,r;
System.out.println("Enter the n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n!=0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(temp==sum)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("not a Armstrong number");
}
}
}

