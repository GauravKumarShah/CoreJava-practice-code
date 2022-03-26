package Gaurav;
import java.io.*;
class FileWriterExample
{
public static void main(String[]args) throws Exception
{
FileWriter fw = new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\Niit\\Jatin.ppt",true);
fw.write(157);
fw.flush();
}
}
