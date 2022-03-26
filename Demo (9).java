interface MyInterface
{
   
   default void method1(){
	System.out.println("Work done");
	}
   static void method2(){
	System.out.println("Not Done");
}}
class Demo implements MyInterface
{
   public static void main(String arg[])
   {
	MyInterface obj = new Demo();
	obj.method1();
   }
}