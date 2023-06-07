import java.util.Scanner;
class LargeNumber
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max;
if(a>b)
{
if(a>c)max=a;
else max=c;
}
else
{
if(b>c)max=b;
else max=c;
}
System.out.print("maximum no is"+max);
}
}


