package Gaurav;
class VariableThisExample
{
int a;
String name;
public static void main(String[]args)
{
VariableThisExample t = new VariableThisExample(45,"NIIT");
t.show();
}
VariableThisExample(int a,String name)
{
this.a = a; 
this.name = name;
}
void show()
{
System.out.println(a +" "+name);
}
}
