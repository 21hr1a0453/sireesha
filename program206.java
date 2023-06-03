// java program to find the ASCII value of a character
import java.util.*;
public class program206{
public static void main(String[]args)
{
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int ascii_var=(int)ch;
        System.out.println("ASCII of"+ch+"is"+ascii_var); //
        }
}