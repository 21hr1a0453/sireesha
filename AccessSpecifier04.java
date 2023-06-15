class Student{
public int id;
public String name;
private void display(){
System.out.println(this.id+" "+this.name);
}
public void displayStudent(){display();}
}
class Test{
public static void main(String args[]){
Student ob=new Student();
ob.displayStudent();
ob.id=25841;
ob.name="Siri";
ob.displayStudent();
}
}