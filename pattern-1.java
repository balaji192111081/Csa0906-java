import java.io.*;
import java.util.*;
class pattern
{
public static void main(String args[])
{
int n,i,j;
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++){
for(j=i;j<=1;j--){
System.out.print("* ");
}
System.out.print("\n");
}
}
}
