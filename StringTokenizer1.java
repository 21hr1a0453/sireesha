import java.util.StringTokenizer;
class Simple{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("my name is siri","");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}