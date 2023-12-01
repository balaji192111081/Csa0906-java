import java.io.*;
import java.util.*;
class Arithmetic1
{
public static void main(String args[])
{
int x,add,sub,mul,div,mod,a,b;
System.out.println("Enter the case x,a and b values:");
Scanner s=new Scanner(System.in);
x=s.nextInt();
a=s.nextInt();
b=s.nextInt();
add=a+b;
sub=a-b;
mul=a*b;
div=a/b;
mod=a%b;
switch(x)
{
case 1:
System.out.println("The Addition is:" +add);
break;
case 2:
System.out.println("The subtraction is:" +sub);
break;
case 3:
System.out.println("The multiplication is:" +mul);
break;
case 4:
System.out.println("The division is:" +div);
break;
case 5:
System.out.println("The modulus is:" +mod);
break;
default:
System.out.println("The enter case is wrong");
}
}
}


