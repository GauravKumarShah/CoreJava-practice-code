class ThisVariable
{
int num;
public static void main(String[]args)
{
ThisVariable t = new ThisVariable(10);
t.show();
}
void show()
{
System.out.println(num);
}
ThisVariable(int num)
{
num = num;
}
}