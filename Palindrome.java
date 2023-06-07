import java.util.Scanner;
  class Palindrome
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
strobj=strobj.toLowerCase();
String rev="";
for(int i=strobj.length()-1;i>=0;i--){rev=rev+strobj.charAt(i);}
if(strobj.equals(rev))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
