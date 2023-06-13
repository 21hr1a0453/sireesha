class Author
{
String authorName;
int age;
String place;
Author(String name,int age,String place){
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;
Book(String n,int p,Authorn auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main (String args[]){
Author auther=new Author("John",42,"USA");
Book b=new Book("Java for Begginers",800,auther);
System.out.println("Book Name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println(".......Author Details.........");
System.out.println("Auther Name:")
System.out.println(":")
System.out.println(":")
}
}