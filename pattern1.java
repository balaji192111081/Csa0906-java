import java.io.*;
import java.util.*;
class pattern1
{
public static void main(String args[])
{
int n,i,j,c=1;
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++){
for(j=1;j<=i;j++){
System.out.print( c+"\t");
c++;
}
System.out.print(" \n");
}
}
}
