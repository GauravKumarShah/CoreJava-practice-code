import java.io.*;

class PrintWriterExample
{
public static void main(String []args) throws Exception 
{
PrintWriter pw = new PrintWriter("Gaurav.txt");
pw.write(100);
pw.print(100);
pw.println("class");
pw.println(" OF IO");
pw.close();
}
}