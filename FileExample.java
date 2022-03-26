package Gaurav;
import java.io.*;
class FileExample
{
public static void main(String []args)
{
int i=0; 
File f = new File("C:");
String s[] =f.list();
for(String ss :s)
{
i++;
System.out.println(ss);
}
System.out.println("No. of files are : "+i);
}}