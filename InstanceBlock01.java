class Student{
public int id;
public String name;
private void display(){
System.out.println(this.id+" "+this.name);
}
public void displayStudent(){display();}
{id=1111;name="test";}
}
class Test{
public static void main(String args[]){
Student ob1=new Student();
ob1.displayStudent();
Student ob2=new Student();
ob2.displayStudent();

}
}