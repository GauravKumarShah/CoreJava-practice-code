import java.io.*;
import java.util.Scanner;
class Funprogrammer {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
        String str=null, nstr="";
	System.out.println("Enter your word");
	str = scan.nextLine();
        char ch;
      System.out.print("Original word: ");
      System.out.println(str); //Example word
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of
      }
      System.out.println("Reversed word: "+ nstr);
    }
}