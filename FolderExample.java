package Gaurav;
import java.io.*;
class FolderExample
{
public static void main(String []args)  throws Exception
{
File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Rohit");
f.mkdir();
System.out.println(f.exists());
show(); print();
}
static void show() throws Exception
{
File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Rohit\\Nischal.ppt");
f.createNewFile();
System.out.println(f.exists());
}
static void print() throws Exception
{
File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Rohit\\Gaurav.xlsx");
f.createNewFile();
System.out.println(f.exists());
}
}