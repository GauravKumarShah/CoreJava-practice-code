package Gaurav;
import java.util.regex.*;
class MetaCharacterExample
{
public static void main(String []args)
{
Pattern p = Pattern.compile("\\D");
Matcher m = p.matcher("53465344548+47965484654867485598878585");
while(m.find())
{
System.out.println(m.start()+"......"+m.group());
}
}
}