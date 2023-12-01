import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
int i,n,;
System.out.println("enter the n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(n+"!="+fact);
}
}
