class print_stars_pluse_minus
{
public static void print_multiple_chars(int i,char c)
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.print(c);
}
public static void main (String args[])
{
int j=5;

print_multiple_chars(j,'*');
print_multiple_chars(j+1,'+');
print_multiple_chars(j+2,'-');

System.out.println("");
}
}