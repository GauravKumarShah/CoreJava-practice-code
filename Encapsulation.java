class Encapsulation
{
private void show()
{
System.out.println("Private show called...");
}
public static void main(String []ajay)
{
System.out.println("Ajay called");
Encapsulation c = new Encapsulation();
c.show();
}
}