import java.io.*;
import java.util.*;
class pattern
{
public static void main(String args[])
{
int i,j,n;
String ch;
Scanner s=new Scanner(System.in);
n=s.nextInt();
ch=s.next();
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(ch+" ");
}
System.out.println();
}
}
}
