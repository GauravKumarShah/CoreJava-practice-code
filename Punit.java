class Vikas
{
void show()
{
System.out.println("Black t shirt");
}
}
class Punit extends Vikas
{
void show()
{
System.out.println("Orange t shirt");
}
public static void main(String[]args)
{
Punit t = new Punit();
t.show();
}
}