import java.io.*;

class FileReaderExample
{
public static void main(String []args) throws Exception
{
File f = new File("Jatin.ppt");
f.createNewFile();
FileReader fr = new FileReader("Jatin.ppt");
int i = fr.read();
while(i!=-1)
{
System.out.println((char)i);
i = fr.read();
}
}
}