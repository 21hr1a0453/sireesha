class Animal4{
public void move(){System.out.println("Call from Animal can move");}
}
class Wild extends Animal4{
public void move(){System.out.println("Call from Wild class");}
}
class Pet extends Animal4{
public void move(){System.out.println("Call from Pet class");}
}
class TestAnimal{
public static void main(String args[]){
Animal4 a=new Animal4();
Animal4 W=new Wild();
Animal4 p=new Pet();
a.move();
W.move();
p.move();
}
}
