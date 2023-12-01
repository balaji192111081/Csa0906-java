import java.io.*;
import java.util.*;
class Landf
{
public static void main(String args[])
{
int l,b,cost,perimeter;
System.out.println("Enter the l & b values:");
Scanner s=new Scanner(System.in);
l=s.nextInt();
b=s.nextInt();
perimeter=2*(l+b);
cost=14*perimeter;
System.out.println("perimeter of land"+perimeter);

