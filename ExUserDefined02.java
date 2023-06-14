import java.util.*;
class S extends Exception{
String msg;
S(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rollno=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
try{
if(marks<0){
throw new S("marks should not be negative.marks=0");
}
}

catch(S ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
