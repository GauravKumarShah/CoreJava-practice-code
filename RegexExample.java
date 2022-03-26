package Gaurav;
import java.util.regex.*;
class RegexExample
{
public static void main(String []args)
{  int count = 0;
Pattern p = Pathern.compile("[ab]");
Matcher m = p.matcher("my name is gauravfijlkfjdskjhdkffkdsfksdjfdkfdkffkfnsdkfkjn");
while(m.find())
{
System.out.println(m.start()+"...."+m.group());
}
System.out.println(count);
}
}
