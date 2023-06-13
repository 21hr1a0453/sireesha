class Animal3{
public void move(){System.out.println("Animals can move");}
}
class Dog extends Animal3{
public void move(){System.out.println("Dogs can walk and run");}
}
class TestDog{
public static void main(String args[]){
Animal3 a=new Animal3();
Animal3 b=new Dog();
a.move();
b.move();
}
}