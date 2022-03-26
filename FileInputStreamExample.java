import java.io.*;
class FileInputStreamExample
{
public static void main(String []args) throws Exception
{
File f= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Gaurav.txt");
f.createNewFile();
FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Gaurav.txt");
int i = fis.read();
System.out.println(i);
}
}