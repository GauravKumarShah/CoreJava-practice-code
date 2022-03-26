class Hindi
{
void show()
{
System.out.println("Hindi show");
}
}
class English extends Hindi
{
void show()
{
System.out.println("English show"); 
}
public static void main(String []args)
{
English t = new English();
t.show();
}
}
