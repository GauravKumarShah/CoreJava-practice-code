package Gaurav;
import java.util.*;
import java.util.regex.*;

class PatternExample
{
public static void main(String []aegs)
{
int count = 0;
Scanner scan = new Scanner(System.in);
System.out.println("What do you want to search ?");
Pattern p = Pattern.compile(scan.nextLine());
Matcher m = p.matcher(scan.nextLine());
while(m.find())
{count++;
System.out.println(m.start()+"..."+m.end()+"..."+m.group());
}
System.out.println("no. of occurrence :"+count);
}
}