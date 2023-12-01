import java.io.*;
import java.util.*;
class diff
{
public static void main(String args[])
{
int i,j,t=0,sum,d,a,b;
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
System.out.println("enter nth maax and nth min values");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
d=x[a]-x[b];
System.out.print("diff="+d);
}
}
