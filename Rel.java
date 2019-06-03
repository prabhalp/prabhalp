class Rel
{
public static void main(String args[])
{
int x=10,y=20;
System.out.println((x++ < y++)&&(++y >= y));
System.out.println(x);
System.out.println(y);
}
}