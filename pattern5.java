import java.io.*;
import java.util.*;
class pattern5
{
public static void main(String args[])
{
int n,i,j;
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==1 || i==5 || j==1 ||j==5)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.print("\n");
}
}
}
