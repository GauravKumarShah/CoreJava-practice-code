package Gaurav;
import java.util.*;
class StringTokenizerExample
{
public static void main(String []args)
{
StringTokenizer st = new StringTokenizer("My name is Gaurav");
while (st.hasMoreTokens())
{
System.out.print(st.nextToken());
}
}
}
