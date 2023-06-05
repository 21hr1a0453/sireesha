import java.util.Scanner;
 class SumNumbers
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
for(int i=0;i<=num;i++)
{
sum+=i;
}
System.out.println("Sum:" +sum);
}
}