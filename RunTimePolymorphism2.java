class Animal{
public void move(){System.out.println("Call from Animal can move");}
}
class Wild extends Animal{
public void move(){System.out.println("Call from Wild class");}
}
class pet extends Animal{
public void move(){System.out.println("Call from pet class");}

class TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal W=new Wild();
Animal p=new pet();
a.move();
W.move();
p.move();
}
}
}