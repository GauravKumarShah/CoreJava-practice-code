package Gaurav;
import java.util.*;
class ProjectExample
{
public static void main(String []args)
{
String s= null;
Scanner scan = new Scanner(System.in);
do 
{
System.out.println("Enter your ID");
String a = scan.nextLine();
System.out.println("Enter your password");
String b = scan.nextLine();
if(a.equals ("Gaurav") && b.equals("Password"))
{
System.out.println("Login successfully");
}
else
{
System.out.println("Login failed");
}
System.out.println("If you want to go to your program then press 1");
s = scan.nextLine();
}while(s.equals("1"));
}
}