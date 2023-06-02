import java.util.*;
public class program202 {
public static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(isEven(n))
System.out.print("Even\n");
else
 System.out.print("odd\n");
          
}
}