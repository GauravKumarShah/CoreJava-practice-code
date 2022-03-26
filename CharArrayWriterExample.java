package Gaurav;
import java.io.*;    
class CharArrayWriterExample
{  
public static void main(String args[]) throws Exception
{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("My name is Gaurav");    
          FileWriter f=new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\Gaurav.txt");    
          out.writeTo(f);     
          f.close();    
         }    
        }    