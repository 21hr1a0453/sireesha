import java.util.Scanner;
class if_example{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int min;
if(i<j){min=i;}
else
{min=j;}
System.out.println("minimum:"+min);
}
}