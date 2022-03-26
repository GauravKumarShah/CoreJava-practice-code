class SwitchCase
{
public static void main(String[]arr)
{
int i=50,j=60,k=0;
int num=5;
switch(num)
{
case 1:
k=i+j;
System.out.println(k);
break;
case 2:
k=i-j;
System.out.println(k);
break;
case 3:
k=i/j;
System.out.println(k);
break;
case 4:
k=i*j;
System.out.println(k);
case 5:
k=i%j;
System.out.println(k);
break;
default :
System.out.println("Invalid Choice");
break;
}}}
