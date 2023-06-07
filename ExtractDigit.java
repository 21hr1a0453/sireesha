import java.util.Scanner;
  class ExtractDigit{
public  static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
String res="";
for(int i=0;i<strobj.length()-1;i++)
{
if(strobj.charAt(i)>='0'&&strobj.charAt(i)<='9')
{ res=res+ strobj.charAt(i); }
System.out.print(res);
}
}
}