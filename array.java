import java.io.*;
import java.util.*;
class array
{
public static void main(String args[])
{
int i;
int x[]=new int[5];
System.out.println("enter any 5 values");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
x[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println(x[i]);
}
}
}

