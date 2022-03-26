package Gaurav;
import java.util.*;
class Prime
{
public static void main(String []aegs)
{
int temp; boolean prime = true;
String s = null;
do
{
Scanner scan  = new Scanner(System.in);
System.out.println("Enter your number (for checking prime number)");
int num = scan.nextInt();
for(int i = 2 ;i<= num/2;i++)
{
temp =num%i;
if(temp == 0)
{
prime = false;
break;
}
}
if(prime)
{
System.out.println("It is prime number");
System.out.println(num);
}
else
{
System.out.println("It is not prime number");
System.out.println(num);
}
System.out.println("Do you what to continue ?");
       s = scan.next();
}while(s.equals("yes") || s.equals("Y") || s.equals ("YES")  || s.equals("y"));
}
}