import java.io.*;
import java.util.*;
class add
{
int x,y;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter x and y values:");
x=s.nextInt();
y=s.nextInt();
System.out.println("sum of two values:"+(x+y));
}
}
class s1
{
public static void main(String args[])
{
add a=new add();
a.display();
}
}
