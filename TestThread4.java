class First{
public static void main(String args[])throws Exception{
Thread t=Thread.currentThread();
System.out.println("CURRENTTHREAD="+t);
t.setName("NewThreadbyPawan");
t.setPriority(t.getPriority()-1);
System.out.println("CURRENTTHREAD="+t);
System.out.println("NAME="+t.getName());
}
}
