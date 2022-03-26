package Gaurav;
import java.util.regex.*;
class SplitExample
{
public static void main(String []args)
{
Pattern p = Pattern.compile("\\.");
String []s= p.split("niit.co.in");
for(String ss : s)
{
System.out.println(ss);
}
} 
} 