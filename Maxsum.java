import java.io.*;
import java.util.*;
class Maxsum
{
public static void main(String args[])
{
int i,j,t=0,sum,d;
int x[]=new int[5];
System.out.println("enter any 5 values");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
x[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(x[i]>x[j])
{
t=x[i];
x[i]=x[j];
x[j]=t;
}
}
}
for(i=0;i<5;i++)
{
System.out.print(x[i]+",");
}
sum=x[0]+x[4];
d=x[4]-x[0];
System.out.print("sum="+sum+"\ndiff="+d);
}
}
