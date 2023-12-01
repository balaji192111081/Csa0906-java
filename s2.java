import java.io.*;
import java.util.*;
class area
{
int r;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius of circle:");
r=s.nextInt();
System.out.println("area of circle:"+(3.14*r*r));
System.out.println("circumference of circle:"+(2*3.14*r));
}
}
class s2
{
public static void main(String args[])
{
area a=new area();
a.display();
}
}
