class Test extends Thread
{
public static void main(String []args)
{
Test t = new Test();
t.start();
Test t1 = new Test();
t1.start();
Test t2 = new Test();
t2.start();
t1.setName("GAURAV");
t.setName("SOURAV");
t2.setName("Preeti");
t2.setPriority(Thread.MIN_PRIORITY);
System.out.println(Thread.currentThread().getName());
}
public void run()
{
System.out.println(Thread.currentThread().getName());
}
}
