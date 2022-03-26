package Gaurav;
import java.util.*;
import java.io.*;
import java.util.regex.*;
class  Project 
{
public static void main(String []args)
{
System.out.println("\n\n\t\t\t\tWelcome to Developer of programming languages");
Scanner scan = new Scanner(System.in);
System.out.println("\n\n\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<!  Enter your Login ID  !>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n\t\t\t");
String Name = scan.nextLine();
System.out.println("\n\n\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<!  Enter the password  !>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n\t\t\t");
String Password = scan.nextLine();
if(Name.equals("Password@123") && Password.equals("Gaurav@123"))
{
System.out.println("Login successfully");
}
else 
{
System.out.println("Login failed");
}

}
}