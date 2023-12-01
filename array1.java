import java.io.*;
import java.util.*;
class array1
{
public static void main(String args[])
{
int i,even=0,odd=0;
int x[]=new int[5];
System.out.println("enter any 5 values");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
x[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
if(x[i]%2==0){
even=even+x[i];
}
else
{
odd=odd+x[i];
}
}
System.out.println("odd="+odd+"\neven="+even);
}
}

