import java.io.*;
import java.util.*;
class Areaofcirclesquare
{
public static void main(String srgs[])
{
int r,S,a;
System.out.println("enter the r and a values:");
double Area;
Scanner s=new Scanner(System.in);
r=s.nextInt();
a=s.nextInt();
Area=3.14*r*r;
S=a*a;
System.out.println(Area);
System.out.println("Area of square"+S);
}
}
