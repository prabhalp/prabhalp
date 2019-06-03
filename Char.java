import java.util.Scanner;
class Char
{
public static void main(String args[])
{
char ch;
System.out.println(" enter the value:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>=65) && (ch<=90))
System.out.println("you entered an UPPERCASE character: ");
else if((ch>=48) && (ch<=57))
System.out.println("you entered an digit: ");
else if((ch>=95) && (ch<=122))
System.out.println("you entered an lowercase character: ");
else
System.out.println("you entered an special character: ");
}
}
