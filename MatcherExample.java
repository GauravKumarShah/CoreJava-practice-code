package Gaurav;
import java.util.*;
import java.util.regex.*;
class MatcherExample
{
public static void main(String []args)
{
Scanner scan =new Scanner(System.in);
Pattern p = Pattern.compile(scan.nextLine());
Matcher m = p.matcher(scan.nextLine());
while(m.find())
{
System.out.println(m.start()+"..."+m.end()+"..."+m.group());
}
}
}