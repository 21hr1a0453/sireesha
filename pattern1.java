import java.util.Scanner;
class Pattern1{
public static void printpattern(char c,int i){
for(int i=0;i<n;i++){
System.out.print();
for(int j=0;j<=1;j++)System.out.print(c);
}
}
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPattern(ch,row);
}
}
