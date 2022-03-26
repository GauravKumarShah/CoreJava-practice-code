package Gaurav;
import java.io.*;
class FilterInputStreamExample
{
public static void main(String []args) throws IOException
{
File f= new File("Gaurav.txt");
FileInputStream file= new FileInputStream(f);
FilterInputStream filter= new BufferedInputStream(file);
int i= 0;
while((i = filter.read())!=-1)
{
System.out.print((char)i);
}
file.close();
filter.close();
}
}