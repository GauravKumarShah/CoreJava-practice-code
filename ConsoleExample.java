import java.io.*;  
class ConsoleExample
{    
public static void main(String args[])
{    
Console c=System.console();    
System.out.println("Enter your password: ");    
char[] ch=c.readPassword();    
String pass=String.valueOf(ch);    
System.out.println("Password is: "+pass);    
}    
}  