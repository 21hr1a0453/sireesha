class scope
{
public static void main(String args[])
{
int i;
i=100;
System.out.println("value of i here is"+i);
{
int j;
j=55;
i=i*j;
System.out.println(i);
 System.out.println(j);
}
System.out.println(i);

}
}