import java.io.*;
class WriterExample
{
public static void main(String []args) throws IOException
{
Writer w = new FileWriter("Gaurav.txt"); 
String s = "I love my army";
w.write(s);
w.flush();
}
}