import java.util.*;
class sWap{
public static void main(String args[])
{
System.out.println("Enter the value of x and y");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("before swaping numbers:"+x+""+y);
{
x=x+y;
y=x-y;
x=x-y;

System.out.println("After swaping numbers:"+x+""+y);

}
}
}