import java.util.*;
public class program204{
static int diff (int a,int b){return a-b;}
static int product(int a,int b){return a*b;}
static int smallest(int a,int b){
if(a<b)return a;
if(b<a)return b;
return 0;}
static int largest(int a, int b){
if(a>b)return a;
if(b>a)return b;
return 0;}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.println("Enter the number:");
num1=sc.nextInt();
System.out.println("Enter the number:");
num2=sc.nextInt();
result=diff(num1,num2);//task a
System.out.println("Difference is"+result);
result=product(num1,num2);//task b
System.out.println("Product is"+result);
result=smallest(num1,num2);//task c
System.out.println("Smallest is"+result);
result=largest(num1,num2);//task d
System.out.println("Largest is"+result);
}
}
