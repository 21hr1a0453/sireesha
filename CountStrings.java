
import java.util.Scanner;
public class CountStrings{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
int count=0;
for(int i=1;i<=str.length()-1;i++){
count++;
}
System.out.println(count);
}
}