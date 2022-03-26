package Gaurav;
import java.util.regex.*;
import java.io.*;
import java.util.*;
class ExampleDemo
{
	public static void main(String []args) throws Exception
	{
	System.out.println("\n\n\n");
	System.out.println
	("\t\t\t\t||<<<<<<<<<<<<<<<! LOGIN !>>>>>>>>>>>>>>>||\n\n");
	System.out.println
("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	Scanner sc = new Scanner(System.in);
	System.out.print
	("\n\t\t\t\t||<<<<<<<<<<<<<! Enter Username !>>>>>>>>>>>>>||\n\n\t\t\t\t\t\t");
	String uname = sc.nextLine();
	System.out.print
	("\n\t\t\t\t||<<<<<<<<<<<<<! Enter Password !>>>>>>>>>>>>>||\n\n\t\t\t\t\t\t");
	String upass = sc.nextLine();
	if(uname.equals("Gaurav")&&upass.equals("Password@123"))
	{
	System.out.println
("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println
("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<$$-Please Add Your Data Below-$$>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	PrintWriter pw = new PrintWriter("info.txt");
	System.out.print
	("\n\t\t\t\t||<<<<<<<<<<<<<! Enter name !>>>>>>>>>>>>>||\n\n\t\t\t\t\t\t\t");
	pw.println("Name is : "+sc.nextLine());
	System.out.print
	("\n\t\t\t\t\t||<<<<<<<<<<<<<! Enter email !>>>>>>>>>>>>>||\n\n\t\t\t\t\t\t\t");
	pw.println("Email is : "+sc.nextLine());
	Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
	Matcher m = p.matcher("Fabberea@gmail.com");
	boolean b = m.matches();
	if(m.find())
	{
	System.out.println(b);
	b = false;
	}
		System.out.print
	("\n\t\t\t\t||<<<<<<<<<<<<<! Enter Phone !>>>>>>>>>>>>>>||\n\n\t\t\t\t\t\t");
	pw.println("Phone number is : "+sc.nextLine());
	System.out.print
	("\n\t\t\t\t\t||<<<<<<<<<<<<<! Enter Address !>>>>>>>>>>>>>||\n\n\t\t\t\t\t\t\t");
	pw.println("Address is : "+sc.nextLine());	
	System.out.println

( "                                ----------------!!!!!Your profile is completed!!!!!----------------                                 ");

	pw.flush();
}
	else
	{
	System.out.println
("========================================================================================================================");

		System.out.print
("\n\t\t\t--------!!!!!!!!!!!!Invalid Username or Password!!!!!!!!!!!!!--------\n\n\t\t\t\t\t\t");
	
	}
	}
}