class Customer{
int amount=10000;
synchronized void withdraw(int amount){
System.out.println("going to withdraw....");
if(this.amount<amount){
System.out.println("Less balance;waiting for deposit...");
this.amount+=amount;
System.out.println("withdraw completed....");
}
synchronized void deposit(int amount){
System.out.println("going to deposite.....");
this.amount+=amount;
System.out.println("deposited completed....");
notify();
}
}
class Test{
public static void main(String args[]){
final Customer c=new Customer();
new Thread(){
public void run(){c.withdraw(15000);}
}.start();
new Thread(){
public void run(){c.deposit(10000);}
}.start();
}
}
