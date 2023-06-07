class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+""+name+""+fee);}
}
class TestThis2{
public static void main(String args[]){
Student s1=new Student(453,"siri",5000f);
Student s2=new Student(428,"theju",6000f);
Student s3=new Student(427,"vanu",2000f);
Student s4=new Student(426,"sravani",8000f);
s1.display();
s2.display();
s3.display();
s4.display();
}
}