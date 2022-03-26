import java.util.*;
class Gaurav
{
public static void main(String []args)
{
Locale l[] = Locale.getAvailableLocales();
for(Locale info : l)
{
System.out.println(info.getDisplayCountry()+ "..."+info.getDisplayLanguage());
}
}
}