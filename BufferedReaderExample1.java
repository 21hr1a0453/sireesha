import java.io.*;
public class BufferedReaderExample1{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter your name");
String name="";
while(!name.equals("stop")){
System.out.println(" Enter data:");
name=br.readLine();
System.out.println(" data is:"+name);
}
br.close();
r.close();
}
}
