import java.io.*;
import java.util.*;
class Leapyear
{
public static void main(String args[])
{
int year,rem,left;
System.out.println("Enter the year:");
Scanner s=new Scanner(System.in);
year=s.nextInt();
rem=year%4;
left=4-rem;
if(year%4==0 && year%400==0)
{
System.out.println("Leapyear");
}
else
{
System.out.println("Not a leapyear and wait for" +left+"year");
}
}
}



