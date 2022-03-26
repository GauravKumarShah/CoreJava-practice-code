import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class BirthDayFinder {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    System.out.println(calculateBornDay(s1));
  }
  public static String calculateBornDay(String s1) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat sdf1 = new SimpleDateFormat("EEEEE");
    Date d = sdf.parse(s1);
    String s = sdf1.format(d);
    return s.toUpperCase();
  }
}