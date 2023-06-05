import java.util.Scanner;
  class sumDigits
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.print("Enter any positive integer:");
n=sc.nextInt();
while(n>0){
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}