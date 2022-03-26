class ThisVariableExample
{
int num;
String name;
ThisVariableExample(int num,String name)
{
this.num =num;
this.name = name;
}
void show()
{
System.out.println(num+  "  "  +name);
}
public static void main(String[]args)
{
ThisVariableExample t = new ThisVariableExample(10,"Hello");
t.show();
}
}