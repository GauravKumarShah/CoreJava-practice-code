			package StringMethodsExample;
			class E
{
public static void main(String[]args)
{
String name = "Gaurav";
char ch = name.charAt(3);
System.out.println(ch);

}
}

			class F
{
public static void main(String []args)
{
String str = "Welcome to javatpoint portal";
int strLength = str.length();
System.out.println(str.charAt(0));
System.out.println(str.charAt(strLength-1));
}
}

			class CompareToExample
{
public static void main(String []args)
{
String g= "gaurav";
String g1= "sourav";
String g2= "aman";
String g3= "punit";
String g4= "rohit";
String g5= "nischal";
System.out.println(g.compareTo(g1));
System.out.println(g.compareTo(g2));
System.out.println(g.compareTo(g3));
System.out.println(g.compareTo(g4));
System.out.println(g.compareTo(g5));
}
}	

			class ConcatExample
{
public static void main(String []args)
{
	String g1 = "MY";  
        String g2 = "first program";  
        String g3 = "in notepad";    
        String g4 = g1.concat(" ").concat(g2).concat(" ").concat(g3);  
        System.out.println(g4);  
}
}

			class ContainsExample
{  
public static void main(String[] args)
{  
String gaurav="My first program in Netbeans";  
System.out.println(gaurav.contains("program"));  
System.out.println(gaurav.contains("about"));  
System.out.println(gaurav.contains("hello"));  
}
}  

			class EndsWithExample
{  
public static void main(String[] args)
{  
String gaurav="Gaurav My name is";  
System.out.println(gaurav.endsWith("My name is"));  
System.out.println(gaurav.endsWith("Gaurav"));  
}
}

			class EqualsExample
{  
public static void main(String[] args)
{  
String g1="gaurav";  
String g2="gaurav";  
String g3="GAURAV";  
String g4="Rohit";  
System.out.println(g1.equals(g2));  
System.out.println(g1.equals(g3));  
System.out.println(g1.equals(g4));  
}
}

			class EqualsIgnoreCaseExample
{  
public static void main(String[] args)
{  
String g1="gaurav";  
String g2="gaurav";  
String g3="GAURAV";  
String g4="Rohit";  
System.out.println(g1.equalsIgnoreCase(g2));  
System.out.println(g1.equalsIgnoreCase(g3));  
System.out.println(g1.equalsIgnoreCase(g4));  
}
}

			class FormatExample
{  
public static void main(String[] args)
{  
String name="gaurav";  
String gaurav1=String.format("name is %s",name);  
String gaurav2=String.format("value is %f",3.85654);  
String gaurav3=String.format("value is %3.1254f",3.33434547221);  
System.out.println(gaurav1);  
System.out.println(gaurav2);  
System.out.println(gaurav3);  
}
}  
 
			class StringGetBytesExample
{  
public static void main(String[] args)
{  
String gaurav="ABCDEFGHIJKLMNOPQRSTUVWXOYZ";  
byte[] barr=gaurav.getBytes();  
for(int c : barr)
{  
System.out.println(c);  
}  
}
}

			class IndexOfExample
{  
public static void main(String[] args)
{  
String gaurav="This is the example of indexof";  
int index1=gaurav.indexOf("gaurav");  
int index2=gaurav.indexOf("index");  
System.out.println(index1+"  "+index2);
}
}

			class JoinExample
{  
public static void main(String[] args)
{  
String gaurav=String.join("-","welcome","to","javatpoint");  
System.out.println(gaurav);  
}
}

			class LastIndexOfExample
{  
public static void main(String[] args)
{  
String gaurav="My name is gaurav";  
int index1=gaurav.lastIndexOf('s');  
System.out.println(index1);  
}
}

			
			class LengthExample
{  
public static void main(String[] args)
{  
String g1="javatpoint";  
String g2="python";  
System.out.println("string length is: "+g1.length());  
System.out.println("string length is: "+g2.length());  
}
}

			class ReplaceExample
{  
public static void main(String[] args)
{  
String g1="java is a very good programming language";  
String gaurav=g1.replace('a','e');  
System.out.println(gaurav);  
}
}

			class ReplaceAllExample
{  
public static void main(String[] args)
{  
String g1="java is a very good programming language";  
String replaceString=g1.replaceAll("a","e");  
System.out.println(replaceString);  
}
}

			class SplitExample
{  
public static void main(String[] args)
{  
String g1="java string split method by javatpoint";  
String[] words=g1.split("\\s");
for(String w:words)
{  
System.out.println(w);  
}  
}
}     
			class StartsWithExample
{  
public static void main(String[] args)
{  
String g1="java string split method by javatpoint";  
System.out.println(g1.startsWith("java"));  
System.out.println(g1.startsWith("javatpoint"));  
}
}

			class SubstringExample
{  
public static void main(String[] args)
{  
String g1="javatpoint";  
System.out.println(g1.substring(4,8));  
System.out.println(g1.substring(5));  
}
}                 

			class ToCharArrayExample
{  
public static void main(String[] args)
{  
String g1="hello";  
char[] ch=g1.toCharArray();  
for(char c : ch)
{  
System.out.print(c);  
}  
}
}  

			class ToLowerExample
{  
public static void main(String[] args)
{  
String g1="JAVATPOINT HELLO STRING";  
String g1lower=g1.toLowerCase();  
System.out.println(g1lower);  
}
}

			class ToUpperExample
{
public static void main(String[]aeg)
{
String g1 = "my name is gaurav and it is my first.";
String g1upper = g1.toUpperCase();
System.out.println(g1upper);
}
}

			class TrimExample
{  
public static void main(String[] args)
{  
String g1="  hello string   ";  
System.out.println(g1+"javatpoint"); 
System.out.println(g1.trim()+"javatpoint");  
}
}

			class ValueOfExample
{  
public static void main(String[] args)
{  
double value=300.127;  
String s1=String.valueOf(value);  
System.out.println(s1+10);  
}
}

			class GetCharsExample
{  
public static void main(String args[])
{  
String gaurav = new String("hello javatpoint how r u");  
char[] ch = new char[10];          
gaurav.getChars(10,20,ch,0);  
System.out.println(ch);  
}
}

			      