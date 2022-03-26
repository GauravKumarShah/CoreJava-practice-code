package Gaurav;
import java.io.*;
class TT
{
public static void main(String []args) throws Exception
{
File f = new File("Gaurav.txt");
f.createNewFile();
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
String jatin = br.readLine();
while(jatin!= null)
{
System.out.println(jatin);
jatin = br.readLine();
}
}
}