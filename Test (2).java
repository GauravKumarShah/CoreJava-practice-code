package Private;
class Test extends H
{
public static void main(String []ags)
{
int i = 1000;
System.out.println("Test called      "  +i);
Test t = new Test();
new Test(400);
show();
}
static void show()
{
int j = 17000;
System.out.println("My first salary  " +j);
}
Test()
{
System.out.println("Constructor Called");
}
Test (int i )
{
System.out.println(i);
}
}
class H 
{
static void  show()
{
System.out.println("this is the word");
}
}