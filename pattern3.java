import java.util.Scanner;
class pattern3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printReversePattern(ch,row);
}
public static void printReversePattern(char c,int n){
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
public static void printPattern(char c,int n){
for(int i=1;i<=n;i++){
}
}
public static void printLine(char c,int col){
System.out.print("\n");
for(int i=1;i<=col;i++)System.out.print(c);
}
}



