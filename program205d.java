//Java program to check whether the character is an alphabet or not
import java.util.*;
public class program205d
{
public static void main(String[] args)
{char ch;
System.out.print("Enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='0'&& ch<='9')
System.out.println(ch+" is an digit");
else
System.out.println(ch+"is not a digit");
}
}