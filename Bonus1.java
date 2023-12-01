import java.io.*;
import java.util.*;
class Bonus1
{
public static void main(String args[])
{
int bs,empno;
double hra,da,ta,ca,pf,home,lic,gs,ded,ns,bonus;
String empname,designation;
System.out.println("give the amount of bs,designation,empno,empname");
Scanner s=new Scanner(System.in);
bs=s.nextInt();
designation=s.nextLine();
empno=s.nextInt();
empname=s.nextLine();

hra=bs*(0.20);
da=bs*(0.20);
ta=bs*(1.0);
ca=bs*(0.05);
pf=bs*(0.12);
home=bs*(0.10);
lic=bs*(0.05);
gs=hra+da+ca+ta;
ded=pf+home+lic;
ns=gs-ded;
if(ns<10000){
bonus=ns*(0.05);
System.out.println("bonus="+bonus);
}
else if(ns>10000 && 30000>ns){
bonus=ns*(0.10);
System.out.println("bonus="+bonus);
}
else if(ns>30000 && 50000>ns){
bonus=ns*(0.20);
System.out.println("bonus="+bonus);
}
else if(ns>50000){
bonus=ns*(0.30);
System.out.println("bonus="+bonus);
}
}
}

