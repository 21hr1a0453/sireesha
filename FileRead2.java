import java.io.*;
class FileRead2{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\Users\\Bhargav\\Desktop\\JavaTrainingJune2023\\fh\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDigits=0;
while((i=br.read())!=-1){
if(((char)i>='0')&&((char)i<='9'))
countDigits++;}
System.out.print(countDigits);
br.close();
fr.close();
}
}