import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
int x,y,z;
Scanner s= new Scanner(System.in);
System.out.println("enthe the first number:");
x=s.nextInt();
System.out.println("enthe the second number:");
y=s.nextInt();
System.out.println("enthe the third number:");
z=s.nextInt();
if(x>y && x>z)
{
System.out.println("Largest number is:"+x);
}
else if(y>z)
{
System.out.println("Largest number is:"+y);
}
else
{
System.out.println("Largest number is:"+z);
}
}
}