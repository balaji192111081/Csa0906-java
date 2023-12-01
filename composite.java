import java.io.*;
import java.util.*;
class composite
{
public static void main(String args[])
{
int i,j,A,B,count;
Scanner s=new Scanner(System.in);
System.out.println("enter uppercase & lowercase");
B=s.nextInt();
A=s.nextInt();
A++;
System.out.println("composite numbers:");
for(i=A;i<B;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count>2)
{
System.out.print(i+" ");
}
}
}
}
