abstract class Bike1{
Bike1(){System.out.println("bike is created");}
abstract void run();
void changeGear(){System.out.println("gear changed");}
}
class Honda extends Bike1{
void run(){System.out.println("runing safely...");}
}
class TestAbstraction2{
public static void main(String args[]){
Bike1 obj=new Honda();
obj.run();
obj.changeGear();
}
}
