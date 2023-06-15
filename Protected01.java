class Person{
protected String fname="Jhon";
protected String lname="Doe";
protected int age=24;
}
class Student extends Person{
private int graduationYear=2018;
public static void main(String args[]){
Student myObj=new Student();
System.out.println("Name:"+myObj.fname+" "+myObj.lname);
System.out.println("Age:"+myObj.age);
System.out.println("Graduation Year:"+myObj.graduationYear);
}
}
