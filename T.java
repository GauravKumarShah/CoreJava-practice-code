package Gaurav;
import java.util.*;
import java.io.*;

class T
{
public static void main (String args[]) throws Exception
{
	FileWriter fw = new FileWriter("Tinku.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(100);
	bw.write("java");
	bw.newLine();
	bw.write("Android");
	bw.flush();
}
}